package com.example.roomrelationships.tables_second

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dog(
    @PrimaryKey
    val dogId: Int,
    val dogOwnerId: Int,
    val name: String,
    val breed: String
)