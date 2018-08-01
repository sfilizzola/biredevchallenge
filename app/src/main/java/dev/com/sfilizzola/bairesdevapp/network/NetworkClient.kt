package dev.com.sfilizzola.bairesdevapp.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkClient {

    companion object {
        private const val BASE_URL = "https://api.github.com"
    }

    var service: GitHubService
        private set

    init {
        service = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(GitHubService::class.java)
    }
}


