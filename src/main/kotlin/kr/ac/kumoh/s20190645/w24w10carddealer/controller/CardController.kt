package kr.ac.kumoh.s20190645.w24w10carddealer.controller

import kr.ac.kumoh.s20190645.w24w10carddealer.service.CardService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CardController (val service : CardService) {
    @GetMapping("/cards/random")
    fun getRandomCards(model: Model): String {
        service.dealCards()
        val cards= service.getAllCards()
        model.addAttribute("cards", cards.map { it.imageName})
        return "cards"
    }
}