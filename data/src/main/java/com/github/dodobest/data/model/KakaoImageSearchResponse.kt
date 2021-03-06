package com.github.dodobest.data.model

import com.google.gson.annotations.SerializedName

internal data class KakaoImageSearchResponse(
    @SerializedName("meta")
    val meta: KakaoImageSearchResponseMeta,
    @SerializedName("documents")
    val documents: List<KakaoImageSearchResponseDocument>,
)
