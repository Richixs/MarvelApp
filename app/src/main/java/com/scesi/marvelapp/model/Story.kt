package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class Story{
    var available: Int
    var collectionURI: String
    var items: ArrayList<ItemStory>
    var returned: Int


    constructor() {
        this.available = 0
        this.collectionURI = ""
        this.items = arrayListOf<ItemStory>()
        this.returned = 0
    }
}
