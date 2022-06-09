package com.github.dodobest.data.data

import com.github.dodobest.data.model.KakaoImageSearchResponse
import io.reactivex.rxjava3.core.Single

class KakaoImageRemoteDataSourceImpl(
    private val kakaoAPI: KakaoAPI,
) : KakaoImageRemoteDataSource {

    override fun searchImage(
        query: String,
        sort: String,
        page: Int,
        size: Int,
    ): Single<List<KakaoImageSearchResponse>> {
        return kakaoAPI.searchImage(query, sort, page, size)
    }
}