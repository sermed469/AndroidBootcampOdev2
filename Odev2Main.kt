package com.sermedkerim.androidbootcampkotlinlectures.nesne_tabanli_programlama

fun main() {
    val o2 = Odev2()
    val mile = o2.soru1(72.3)
    println("Mil : $mile")

    o2.soru2(3.0,4.0)

    val sonuc = o2.soru3(5)
    println("Faktöriyel : $sonuc")

    o2.soru4("Kelime")

    val toplam = o2.soru5(5)
    println("İç açılar toplamı : $toplam°")

    val maas = o2.soru6(21)
    println("Maaş : $maas TL")

    val ucret = o2.soru7(3)
    println("Otopark ücreti : $ucret TL")
}