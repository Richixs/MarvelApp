package com.scesi.marvelapp.controller

import java.security.MessageDigest

fun main() {
    val publicKey: String = "4b576ce05356aa492171ef1556829c0a"
    val privateKey: String = "45318a8c2bf7cad2890a4495d26534193d7797a1"
    var timestamp : Long = getTimestamp()
    var hash: String = md5(timestamp.toString()+privateKey+publicKey)
    println(hash)
    var url: String = "http://gateway.marvel.com/v1/public/comics"
    url = url + "?" + "ts=" + timestamp + "&apikey=" + publicKey + "&hash=" + hash
    println(url)
}

@OptIn(ExperimentalStdlibApi::class)
fun md5(cadena: String): String {
    val md = MessageDigest.getInstance("MD5")
    val digest = md.digest(cadena.toByteArray())
    return digest.toHexString()
}

fun getTimestamp(): Long {
    val currentTimestamp = System.currentTimeMillis()
    return currentTimestamp
}