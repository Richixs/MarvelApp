package com.scesi.marvelapp.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
class Comic {
    var id: Long
    var digitalId: Int
    var title: String
    var issueNumber: Int
    var variantDescription: String
    var description: String?
    var modified: String
    var isbn: String
    var upc: String
    var diamondCode: String
    var ean: String
    var issn: String
    var format: String
    var pageCount: Int
    var textObjects: ArrayList<TextObject> //Object
    var resourceURI: String
    var urls: ArrayList<Url>
    var series: Serie
    var variants: ArrayList<Variant>
    var collections: ArrayList<CharacterItem> // Object
    var collectedIssues: ArrayList<Issue> //Object
    var dates: ArrayList<DateDetail>
    var prices: ArrayList<Price>
    var thumbnail: Thumbnail
    var images: ArrayList<Image> //Object
    var creators: Creator
    var characters: Character
    var stories: Story
    var events: Event

    constructor() {
        this.id = 0
        this.digitalId = 0
        this.title = ""
        this.issueNumber = 0
        this.variantDescription = ""
        this.description = null
        this.modified = ""
        this.isbn = ""
        this.upc = ""
        this.diamondCode = ""
        this.ean = ""
        this.issn = ""
        this.format = ""
        this.pageCount = 0
        this.textObjects = arrayListOf<TextObject>()
        this.resourceURI = ""
        this.urls = arrayListOf<Url>()
        this.series = Serie()
        this.variants = arrayListOf<Variant>()
        this.collections = arrayListOf<CharacterItem>()
        this.collectedIssues = arrayListOf<Issue>()
        this.dates = arrayListOf<DateDetail>()
        this.prices = arrayListOf<Price>()
        this.thumbnail = Thumbnail()
        this.images = arrayListOf<Image>()
        this.creators = Creator()
        this.characters = Character()
        this.stories = Story()
        this.events = Event()
    }
}
