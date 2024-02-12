package com.sermedkerim.androidbootcampkotlinlectures.nesne_tabanli_programlama

class Odev2 {
    fun soru1(km:Double) : Double{
        return km * 0.621
    }

    fun soru2(kenar1:Double,kenar2:Double){
        val alan = kenar1 * kenar2
        println("Dikdörtgenin alanı : $alan")
    }

    fun soru3(sayi:Int) : Int{

        var faktoriyel = 1
        for(i in sayi downTo 2){
            faktoriyel *= i
        }

        return faktoriyel
    }

    fun soru4(kelime:String){

        var count = 0
        for (char in kelime){
            if(char == 'e' || char == 'E'){
                count++
            }
        }

        println("Kelimedeki e harfi sayısı : $count")
    }

    fun soru5(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    fun soru6(gunSayisi:Int):Int{
        var maas = 0

        if(gunSayisi < 19){
            maas = gunSayisi * 8 * 40
        }else if(gunSayisi == 19){
            maas += (gunSayisi - 1) * 8 * 40
            maas += (6 * 40) + (2 * 80)
        }else{
            maas += 18 * 8 * 40
            maas += (6 * 40) + (2 * 80)
            maas += (gunSayisi - 19) * 8 * 80
        }

        return maas
    }

    fun soru7(otoparkSuresi : Int) : Int{

        var otoparkUcreti = 0

        if(otoparkSuresi == 1){
            otoparkUcreti = 50
        }else{
            otoparkUcreti += 50
            otoparkUcreti += (otoparkSuresi-1)*10
        }

        return otoparkUcreti
    }
}