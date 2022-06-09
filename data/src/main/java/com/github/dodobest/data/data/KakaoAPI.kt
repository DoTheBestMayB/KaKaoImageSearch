package com.github.dodobest.data.data

import com.github.dodobest.data.model.KakaoImageSearchResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface KakaoAPI {

    @Headers("Authorization: KakaoAK $REST_API_KEY")
    @GET("/v2/search/image")
    fun searchImage(
        @Query("query") query: String,
        @Query("sort") sort: String = "accuracy",
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 80,
    ) : Single<List<KakaoImageSearchResponse>>

    companion object {
        const val REST_API_KEY = ""
    }

}