package com.github.dodobest.data.data

import io.mockk.mockk
import io.mockk.verify

import org.junit.Before
import org.junit.Test

internal class KakaoImageRemoteDataSourceImplTest {

    lateinit var kakaoAPI: KakaoAPI
    lateinit var kakaoImageRemoteDataSource: KakaoImageRemoteDataSource

    @Before
    fun setUp() {
        kakaoAPI = mockk(relaxed = true)
        kakaoImageRemoteDataSource = KakaoImageRemoteDataSourceImpl(kakaoAPI)
    }

    @Test
    fun `searchImage 함수를 호출한다`() {
        // when
        kakaoImageRemoteDataSource.searchImage(SEARCH_QUERY)

        // then
        verify { kakaoAPI.searchImage(SEARCH_QUERY) }
    }

    companion object {
        private const val SEARCH_QUERY = "Apple"
    }
}