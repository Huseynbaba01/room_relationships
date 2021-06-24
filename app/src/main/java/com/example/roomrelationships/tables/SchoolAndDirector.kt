package com.example.roomrelationships.tables

import androidx.room.Embedded
import androidx.room.Relation

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "shoolName",
        entityColumn = "directorName"
    )
    val director: Director
)