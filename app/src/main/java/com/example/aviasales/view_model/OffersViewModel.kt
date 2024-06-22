package com.example.aviasales.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData

import com.example.aviasales.model.remote.OffersModel
import com.example.aviasales.repository.OffersRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

class OffersViewModel @Inject constructor(private val repository: OffersRepository) : ViewModel() {
    val offersData: LiveData<List<OffersModel>> = repository.getOffers().asLiveData()

}