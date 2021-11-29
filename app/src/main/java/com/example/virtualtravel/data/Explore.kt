package com.example.virtualtravel.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Explore(
    var nameEx : String,
    var priceEx : String,
    var descEx : String,
    var cateEx : String,
    var locatEx : String,
    var photoEx : String,
):Parcelable