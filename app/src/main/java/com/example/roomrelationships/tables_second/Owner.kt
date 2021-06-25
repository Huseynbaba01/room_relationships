package com.example.roomrelationships.tables_second

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Owner(
    @PrimaryKey val ownerId: Int,
    val name: String
)