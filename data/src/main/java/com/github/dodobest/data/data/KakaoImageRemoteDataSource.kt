package com.github.dodobest.data.data

import com.github.dodobest.data.model.KakaoImageSearchResponse
import io.reactivex.rxjava3.core.Single

interface KakaoImageRemoteDataSource {

    fun searchImage(
        query: String,
        sort: String = "accuracy",
        page: Int = 1,
        size: Int = 80,
    ) : Single<KakaoImageSearchResponse>
}