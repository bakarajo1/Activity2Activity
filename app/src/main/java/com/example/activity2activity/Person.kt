package com.example.activity2activity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Person (
        val name:String,
        val surname:String,
        val age:Int,
        val job:String
        ): Parcelable
