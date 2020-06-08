package com.example.chorandinhoemdesesperovol7.util

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

@Suppress("DEPRECATION")
inline fun <reified Model : ViewModel> FragmentActivity.viewModel(): Model =
    ViewModelProviders.of(this).get(Model::class.java)