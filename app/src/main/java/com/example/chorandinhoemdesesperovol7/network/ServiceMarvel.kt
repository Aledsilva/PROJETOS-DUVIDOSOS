package com.example.chorandinhoemdesesperovol7.network

import com.example.chorandinhoemdesesperovol7.model.ComicResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceMarvel {

    @GET("comics")
    suspend fun getComicService(
        @Query("ts") ts: String,
        @Query("hash") hash: String,
        @Query("apikey") apikey: String,
        @Query("limit") limit: Int = 100
    ): ComicResponse
}