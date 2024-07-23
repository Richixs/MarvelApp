package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class Image {
    var path: String
    var extension: String

    constructor(){
        this.path = ""
        this.extension = ""
    }
}