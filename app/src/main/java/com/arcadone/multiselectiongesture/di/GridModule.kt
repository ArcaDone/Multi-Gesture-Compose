package com.arcadone.multiselectiongesture.di

import com.arcadone.multiselectiongesture.PhotoGridViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val gridModule = module {
    viewModel {
        PhotoGridViewModel()
    }
}