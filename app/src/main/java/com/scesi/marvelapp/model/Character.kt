package com.scesi.marvelapp.model

import java.util.Objects

class Character {
    var available: Int
    var collectionURI: String
    var items: ArrayList<Object>
    var returned: Int

    constructor() {
        this.available = 0
        this.collectionURI = ""
        this.items = arrayListOf<Object>()
        this.returned = 0
    }
}
