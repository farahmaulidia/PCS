package com.appserba.app.data.remote

import android.telecom.Call
import com.appserba.app.data.model.NewsList
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("/native/foodstreet")
    fun listNews() : retrofit2.Call<NewsList>

    @GET("/native/foodstreet")
    fun detailNews(@Query("nama_makanan") url: String) : retrofit2.Call<NewsList>

    @GET("/native/foodstreet")
    fun searchNews(@Query("q") url:  String) : retrofit2.Call<NewsList>
}