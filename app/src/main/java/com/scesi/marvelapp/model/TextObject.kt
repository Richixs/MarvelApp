package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class TextObject {
    var type: String
    var language: String
    var text: String

    constructor() {
        this.type = ""
        this.language = ""
        this.text = ""
    }

}