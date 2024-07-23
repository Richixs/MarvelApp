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
    var series: Serie
    var variants: ArrayList<Variant>
    var collections: ArrayList<Object>
    var collectedIssues: ArrayList<Object>
    var dates: ArrayList<DateDetail>
    var prices: ArrayList<Price>
    var thumbnail: Thumbnail
    var images: ArrayList<Object>
    var creators: Creator
    var character: Character
    var stories: Story
    var event: Event

    constructor() {
        this.id = 0
        this.digitalId = 0
        this.title = ""
        this.issueNumber = 0
        this.variantDescription = ""
        this.description = ""
        this.modified = ""
        this.isbn = ""
        this.upc = ""
        this.diamondCode = ""
        this.ean = ""
        this.issn = ""
        this.format = ""
        this.pageCount = 0
        this.textObjects = arrayListOf<Object>()
        this.resourceURI = ""
        this.urls = arrayListOf<Url>()
        this.series = Serie()
        this.variants = arrayListOf<Variant>()
        this.collections = arrayListOf<Object>()
        this.collectedIssues = arrayListOf<Object>()
        this.dates = arrayListOf<DateDetail>()
        this.prices = arrayListOf<Price>()
        this.thumbnail = Thumbnail()
        this.images = arrayListOf<Object>()
        this.creators = Creator()
        this.character = Character()
        this.stories = Story()
        this.event = Event()
    }
}