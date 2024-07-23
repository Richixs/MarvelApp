package com.scesi.marvelapp.model

import kotlinx.serialization.Serializable

@Serializable
class DateDetail{
    var type:String
    var date:String

    constructor() {
        this.type = ""
        this.date = ""
    }

}