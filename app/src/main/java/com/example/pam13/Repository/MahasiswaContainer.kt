package com.example.pam13.Repository

import com.example.pam13.Service.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit


interface AppContainer {
    val kontakRepository: MahasiswaRepository
}

class MahasiswaContainer : AppContainer {


