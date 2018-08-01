package dev.com.sfilizzola.bairesdevapp.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {

    @GET("/search/repositories")
    fun serach(@Query("q") query:String): Call<String>


}