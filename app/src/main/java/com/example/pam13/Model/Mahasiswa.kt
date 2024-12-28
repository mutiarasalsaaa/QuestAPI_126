package com.example.pam13.Model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mahasiswa (
    val nim : String,
    val nama : String,
    val alamat : String,

    @SerialName ("Jenis_kelamin")
    val jeniskelamin: String,
    val kelas : String,
    val angkatan : String
)