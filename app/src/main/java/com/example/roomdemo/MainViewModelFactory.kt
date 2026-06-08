package com.example.roomdemo

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Фабрика для MainViewModel — нужна потому, что viewModel() не умеет передавать
 * Application в конструктор напрямую (см. п.10 ЛР).
 */
class MainViewModelFactory(private val application: Application) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(application) as T
    }
}
