package com.example.consumoapi.service

import com.example.consumoapi.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {
    @GET("{cep}/json")
    fun getEnderecoByCep(@Path(value = "cep") cep: String): Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json")
    fun getEnderecoByUfCidadeRua(
        @Path(value = "uf") uf: String,
        @Path(value = "cidade") cidade: String,
        @Path(value = "rua") rua: String
    ): Call<List<Endereco>>

}