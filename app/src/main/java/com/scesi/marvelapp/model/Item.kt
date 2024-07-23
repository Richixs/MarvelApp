package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class Item{
    var resourceURI: String
    var name: String
    var role: String

    constructor() {
        this.resourceURI = ""
        this.name = ""
        this.role = ""
    }
}
