package com.example.chorandinhoemdesesperovol7.model


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class Date(
    @SerializedName("date")
    val date: String,
    @SerializedName("type")
    val type: String
) : Parcelable