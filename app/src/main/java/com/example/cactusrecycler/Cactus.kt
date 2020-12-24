package com.example.cactusrecycler

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Cactus(
    var name : String,
    var description : String,
    var photo : String

): Parcelable