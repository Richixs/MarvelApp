package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class CharacterItem {
    var resourceURI: String
    var name: String

    constructor() {
        this.resourceURI = ""
        this.name = ""
    }
}