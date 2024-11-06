package kr.ac.kumoh.s20190645.w24w10carddealer.repository

import kr.ac.kumoh.s20190645.w24w10carddealer.model.Card
import org.springframework.stereotype.Repository

@Repository
class InMemoryRepository : CardRepository {
    private val cards: MutableList<Card> = mutableListOf()

    override val size: Int
        get() = cards.size

    override fun add(card: Card) {
        cards.add(card)
    }

    override fun getAllCards(): List<Card> {
        return cards
    }

    override fun clear() {
        cards.clear()
    }
}