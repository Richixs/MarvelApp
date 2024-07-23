package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class Data {
    var offset: Int
    var limit: Int
    var total: Long
    var count: Int
    var results: ArrayList<Comic>

    constructor() {
        this.offset = 0
        this.limit = 0
        this.total = 0
        this.count = 0
        this.results = arrayListOf<Comic>()
    }
}
