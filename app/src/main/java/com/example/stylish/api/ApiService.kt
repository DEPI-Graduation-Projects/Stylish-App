package com.example.stylish.api

import com.example.stylish.data.models.Product
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @GET("products")
    suspend fun getProducts(): Response<List<Product>>

    @GET("products/{id}")
    suspend fun getProduct(@Path("id") id: String): Response<Product>

    @POST("products")
    suspend fun addProduct(@Body product: Product): Response<Product>
}