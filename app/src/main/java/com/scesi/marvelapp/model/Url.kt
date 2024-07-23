package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class Url {
    var type: String
    var url: String

    constructor() {
        this.type = ""
        this.url = ""
    }
}
