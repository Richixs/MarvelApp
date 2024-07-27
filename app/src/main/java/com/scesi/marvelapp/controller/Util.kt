package com.scesi.marvelapp.controller

import com.scesi.marvelapp.model.Comic
import java.security.MessageDigest

fun main() {
//    val publicKey: String = "4b576ce05356aa492171ef1556829c0a"
//    val privateKey: String = "45318a8c2bf7cad2890a4495d26534193d7797a1"
//    var timestamp : Long = getTimestamp()
//    var hash: String = md5(timestamp.toString()+privateKey+publicKey)
//    println(hash)
    //473ae699600a2bca73d29ed4b6a9f284
//    var url: String = "http://gateway.marvel.com/v1/public/comics"
//    url = url + "?" + "ts=" + timestamp + "&apikey=" + publicKey + "&hash=" + hash
//    println(url)
    var httpRequest = HttpRequest()
    httpRequest.getRequest()
    var comic = httpRequest.comicsRequest.data.results[0]
    println(comic.thumbnail.path + "." + comic.thumbnail.extension)
}

//@OptIn(ExperimentalStdlibApi::class)
//fun md5(cadena: String): String {
//    val md = MessageDigest.getInstance("MD5")
//    val digest = md.digest(cadena.toByteArray())
//    return digest.toHexString()
//}
//
//fun getTimestamp(): Long {
//    val currentTimestamp = System.currentTimeMillis()
//    return currentTimestamp
//}