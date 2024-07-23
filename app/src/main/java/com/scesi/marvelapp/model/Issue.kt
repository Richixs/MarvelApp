package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class Issue {
    var resourceURI: String
    var name: String

    constructor() {
        this.resourceURI = ""
        this.name = ""
    }
}