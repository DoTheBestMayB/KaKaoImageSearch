package com.github.dodobest.data.model

import com.google.gson.annotations.SerializedName

internal data class KakaoImageSearchResponseMeta(
    @SerializedName("total_count")
    val totalCount: Int,
    @SerializedName("pageable_count")
    val pageableCount: Int,
    @SerializedName("is_end")
    val isEnd: Boolean,
)
