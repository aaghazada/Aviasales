package com.example.aviasales.network

import com.example.aviasales.model.remote.ApiResponse
import com.example.aviasales.model.remote.OffersModel
import okhttp3.Response
import retrofit2.http.GET

interface ApiService {
    @GET("v3/214a1713-bac0-4853-907c-a1dfc3cd05fd")
    suspend fun getOffers(): ApiResponse
}