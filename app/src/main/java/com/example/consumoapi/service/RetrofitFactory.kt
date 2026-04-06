package com.example.consumoapi.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val BASE_URL = "https://viacep.com.br/ws/"

class RetrofitFactory {
    private val retrofitFactory = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    fun getEnderecoService(): EnderecoService {
        return retrofitFactory.create(EnderecoService::class.java)
    }
}