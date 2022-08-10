package com.example.programtest

enum class Season{
    SPRING, SUMMER, FALL, WINTER
}
class EnumLearn {
    fun main(args:Array<String>){
        for (s in Season.values()){
            println(s)
        }
        val sName = "SPRING"
        val s = Season.valueOf(sName)
        println(s)
        println(Season.SPRING)
    }
}