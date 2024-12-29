package com.example.pam13

import android.app.Application
import com.example.pam13.Repository.AppContainer
import com.example.pam13.Repository.MahasiswaContainer

class MahasiswaApplications : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}
