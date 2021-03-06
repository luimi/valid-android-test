package com.lui2mi.validtest.models


import com.google.gson.annotations.SerializedName
import java.text.DecimalFormat

data class ArtistResponse(@SerializedName("topartists") var topartists: ArtistList)
data class ArtistList(@SerializedName("artist") var artist: List<Artist>)
data class Artist(@SerializedName("name") var name: String , @SerializedName("listeners") var listeners: String , @SerializedName("image") var image: List<ArtistImage>){
    fun getFormatListeners(): String{
        val dec = DecimalFormat("#,###.##")
        return dec.format(listeners.toInt()).toString()
    }
}
data class ArtistImage(@SerializedName("#text") var text: String, @SerializedName("size") var size: String)