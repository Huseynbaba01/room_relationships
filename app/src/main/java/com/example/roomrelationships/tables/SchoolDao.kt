package com.example.roomrelationships.tables

import androidx.room.*

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM school_table WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName:String):List<SchoolAndDirector>

}