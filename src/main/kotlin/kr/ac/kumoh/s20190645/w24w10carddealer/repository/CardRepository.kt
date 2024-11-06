package kr.ac.kumoh.s20190645.w24w10carddealer.repository

import kr.ac.kumoh.s20190645.w24w10carddealer.model.Card

interface CardRepository {
    val size: Int
    fun add(card: Card)
    fun getAllCards(): List<Card>
    fun clear()
}