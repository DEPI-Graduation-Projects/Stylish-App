package com.example.stylish.data.local

import com.example.stylish.api.RetrofitInstance
import com.example.stylish.data.models.Product
import retrofit2.Response

class Repository {

    suspend fun getProducts(): Response<List<Product>> {
        return RetrofitInstance.api.getProducts()
    }

    suspend fun getProduct(id: String): Response<Product> {
        return RetrofitInstance.api.getProduct(id)
    }

    suspend fun addProduct(product: Product): Response<Product> {
        return RetrofitInstance.api.addProduct(product)
    }
}