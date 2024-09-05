package com.example.stylish.ui.main.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.stylish.data.local.Repository
import com.example.stylish.data.models.Product
import kotlinx.coroutines.Dispatchers
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun getProducts() = liveData(Dispatchers.IO) {
        val response = repository.getProducts()
        if (response.isSuccessful) {
            response.body()?.let { emit(it) }
        } else {
            emit(emptyList<Product>())
        }
    }

    fun getProduct(id: String) = liveData(Dispatchers.IO) {
        val response = repository.getProduct(id)
        if (response.isSuccessful) {
            response.body()?.let { emit(it) }
        } else {
            emit(null)
        }
    }
}
