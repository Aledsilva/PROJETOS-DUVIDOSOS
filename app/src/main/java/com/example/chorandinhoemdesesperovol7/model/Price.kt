package com.example.chorandinhoemdesesperovol7.model


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class Price(
    @SerializedName("price")
    val price: Int,
    @SerializedName("type")
    val type: String
) : Parcelable