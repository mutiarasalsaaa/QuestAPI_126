package com.example.pam13.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.network.HttpException
import com.example.pam13.Model.Mahasiswa
import com.example.pam13.Repository.MahasiswaRepository
import kotlinx.coroutines.launch
import okio.IOException

sealed class HomeUiState {
    data class Success(val mahasiswa: List<Mahasiswa>) : HomeUiState()
    object Error : HomeUiState()
    object Loading : HomeUiState()
}

class HomeViewModel(private val mhs: MahasiswaRepository) : ViewModel() {
    var mhsUiState: HomeUiState by mutableStateOf(HomeUiState.Loading)
        private set

    init {
        getMhs()
    }



    fun deleteMhs(nim: String) {
        viewModelScope.launch {
            try {
                mhs.deleteMahasiswa(nim)
            } catch (e: IOException) {
                HomeUiState.Error
            } catch (e: HttpException) {
                HomeUiState.Error
            }
        }
    }
}
