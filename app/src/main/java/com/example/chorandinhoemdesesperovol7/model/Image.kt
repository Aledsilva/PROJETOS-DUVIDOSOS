package com.example.chorandinhoemdesesperovol7.model


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class Image(
    @SerializedName("extension")
    val extension: String,
    @SerializedName("path")
    val path: String
) : Parcelable