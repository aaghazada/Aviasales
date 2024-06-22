package com.example.aviasales.repository

import com.example.aviasales.model.remote.ApiResponse
import com.example.aviasales.model.remote.OffersModel
import com.example.aviasales.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class OffersRepository {
    private val apiService = RetrofitClient.apiService

    fun getOffers(): Flow<List<OffersModel>> = flow {
        val response: ApiResponse = apiService.getOffers()
        emit(response.offers)
    }.flowOn(Dispatchers.IO)

}