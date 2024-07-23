package com.scesi.marvelapp.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
class Character {
    var available: Int
    var collectionURI: String
    var items: ArrayList<CharacterItem> //Object
    var returned: Int

    constructor() {
        this.available = 0
        this.collectionURI = ""
        this.items = arrayListOf<CharacterItem>()
        this.returned = 0
    }
}

