package com.lee.kr.STUnitasAOS

import com.google.gson.annotations.SerializedName

class Documents {

    @SerializedName("collection")
    var collection: String? = null

    @SerializedName("thumbnail_url")
    var thumbnail_url: String? = null

    @SerializedName("image_url")
    var image_url: String? = null

    @SerializedName("width")
    var width: String? = null

    @SerializedName("height")
    var height: String? = null

    @SerializedName("display_sitename")
    var display_sitename: String? = null

    @SerializedName("doc_url")
    var doc_url: String? = null

    @SerializedName("datetime")
    var datetime: String? = null

    constructor(
        collection: String?,
        thumbnail_url: String?,
        image_url: String?,
        width: String?,
        height: String?,
        display_sitename: String?,
        doc_url: String?,
        datetime: String?
    ) {
        this.collection = collection
        this.thumbnail_url = thumbnail_url
        this.image_url = image_url
        this.width = width
        this.height = height
        this.display_sitename = display_sitename
        this.doc_url = doc_url
        this.datetime = datetime
    }
}