package com.enzo.evaluacionfatality.dogs


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface AService {
    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogResponse>
}