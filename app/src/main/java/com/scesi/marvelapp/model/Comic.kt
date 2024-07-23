package com.scesi.marvelapp.model

class Comic {
    var id: Long
    var digitalId: Int
    var title: String
    var issueNumber: Int
    var variantDescription: String
    var description: String
    var modified: String
    var isbn: String
    var upc: String
    var diamondCode: String
    var ean: String
    var issn: String
    var format: String
    var pageCount: Int
    var textObjects: ArrayList<Object>
    var resourceURI: String
    var urls: ArrayList<Url>
    var variants: ArrayList<Variant>
    var collectedIssues: ArrayList<Object>
    var prices: ArrayList<Price>
    var images: ArrayList<Object>
    var characters: Characters
    var events: Events
}