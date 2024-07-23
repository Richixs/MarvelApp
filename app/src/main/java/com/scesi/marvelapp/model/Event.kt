package com.scesi.marvelapp.model

class Event {
    var available: Int
    var collectionURI: String
    var items: ArrayList<Item>
    var returned: Int

    constructor() {
        this.available = 0
        this.collectionURI = ""
        this.items = arrayListOf<Item>()
        this.returned = 0
    }
}
