package com.example.aviasales.model.remote

data class OffersModel(
    val id: Int,
    val title: String,
    val town: String,
    val price: Price
)
