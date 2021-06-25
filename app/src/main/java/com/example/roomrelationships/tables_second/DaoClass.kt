package com.example.roomrelationships.tables_second

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface DaoClass {

    @Transaction
    @Query("SELECT * FROM Owner")
    fun getDogsAndOwners(): List<DogAndOwner>

}