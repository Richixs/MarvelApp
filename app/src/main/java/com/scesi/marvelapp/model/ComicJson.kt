package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class ComicJson {
    var code: Int
    var status: String
    var copyright: String
    var attributionText: String
    var attributionHTML: String
    var etag: String
    var data: Data

    constructor() {
        this.code = 0
        this.status = ""
        this. copyright = ""
        this.attributionText = ""
        this.attributionHTML = ""
        this.etag = ""
        this.data = Data()
    }
}
