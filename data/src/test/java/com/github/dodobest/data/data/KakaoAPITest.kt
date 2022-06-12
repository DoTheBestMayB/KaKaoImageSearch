package com.github.dodobest.data.data

import com.github.dodobest.data.model.KakaoImageSearchResponse
import com.google.gson.Gson
import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

class KakaoAPITest {

    private lateinit var server: MockWebServer
    private lateinit var service: KakaoAPI
    private lateinit var baseUrl: HttpUrl

    @Before
    fun setUp() {
        server = MockWebServer()
        baseUrl = server.url("")
        service = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KakaoAPI::class.java)
    }

    @Test
    fun `searchImage를 호출하면 데이터를 수신한다`() {
        // given
        val json = File("src/test/resources/imageSearchSuccessData.json").readText()
        val response = MockResponse().setBody(json)
        server.enqueue(response)
        val expected = Gson().fromJson(json, KakaoImageSearchResponse::class.java)

        // when - then
        service.searchImage(query = QUERY, size = SEARCH_SIZE)
            .test()
            .awaitDone(1L, TimeUnit.SECONDS)
            .assertValue(expected)
    }

    companion object {
        const val QUERY = "사과"
        private const val SEARCH_SIZE = 5
    }
}