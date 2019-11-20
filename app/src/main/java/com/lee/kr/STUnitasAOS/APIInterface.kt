package com.lee.kr.STUnitasAOS

import com.google.gson.annotations.SerializedName

interface APIInterface {

    @SerializedName("total_count")
    var total_count: Int? = null

    @SerializedName("pageable_count")
    var pageable_count: Int? = null

    @SerializedName("is_end")
    var is_end : Boolean? = null


}