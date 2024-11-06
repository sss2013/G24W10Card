package kr.ac.kumoh.s20190645.w24w10carddealer.service

import kr.ac.kumoh.s20190645.w24w10carddealer.model.Card
import kr.ac.kumoh.s20190645.w24w10carddealer.repository.CardRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class CardService(val cardRepository : CardRepository) {
    companion object{
        const val NUMBER_OF_CARDS = 5
    }
    fun getAllCards() : List<Card> = cardRepository.getAllCards()
    fun dealCards(count : Int = NUMBER_OF_CARDS) {
        val suits = arrayOf("spades","diamonds","hearts","clubs")
        val ranks = arrayOf("2","3","4","5","6","7","8","9","10","jack","queen","king","ace")
        cardRepository.clear()
        val uniqueCards = mutableSetOf<Card>()
        while(uniqueCards.size <count){
            val randomSuit = suits[Random.nextInt(suits.size)]
            val randomRank=ranks[Random.nextInt(ranks.size)]

            uniqueCards.add(Card(randomRank, randomSuit))
        }

        val sortedCards= uniqueCards.toList().sortedWith(compareBy({suits.indexOf(it.suit)},
            {ranks.indexOf(it.rank)}))
        sortedCards.forEach{cardRepository.add(it)}
    }
}