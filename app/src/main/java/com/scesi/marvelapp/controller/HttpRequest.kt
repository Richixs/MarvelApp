package com.scesi.marvelapp.controller

import com.scesi.marvelapp.model.Comic
import com.scesi.marvelapp.model.ComicJson
import com.scesi.marvelapp.model.Data
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.security.MessageDigest
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class HttpRequest {
    fun getRequest() {
        val publicKey: String = "4b576ce05356aa492171ef1556829c0a"
        val privateKey: String = "45318a8c2bf7cad2890a4495d26534193d7797a1"
        var timestamp : Long = getTimestamp()
        var hash: String = md5(timestamp.toString()+privateKey+publicKey)
        var url: String = "http://gateway.marvel.com/v1/public/comics"
        url = url + "?" + "ts=" + timestamp + "&apikey=" + publicKey + "&hash=" + hash
        var urlRequest = URL(url)
        println(urlRequest)
        var connection = urlRequest.openConnection()
        BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
            var line: String
            while (inp.readLine().also { line = it } != null) {
                val coercingJson = Json { coerceInputValues = true }
                val obj = coercingJson.decodeFromString<ComicJson>(line)
                println(obj.toString())
                var data: Data = obj.data;
                println("Size: " + data.results.size)
                for(comic: Comic in data.results) {
                    println(comic.title)
                }
            }
        }
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
}
