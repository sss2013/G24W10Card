package kr.ac.kumoh.s20190645.w24w10carddealer.model

data class Card(
    val rank : String,
    val suit: String
) {
    val imageName:String
        get() = "${rank}_of_${suit}.png"
}