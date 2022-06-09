package com.github.dodobest.data.model

import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class KakaoImageSearchResponseDocuments(
    @SerializedName("collection")
    val collection: String,
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("display_sitename")
    val displaySiteName: String,
    @SerializedName("doc_url")
    val docUrl: String,
    @SerializedName("datetime")
    val dateTime: LocalDateTime,
)
