package com.example.stylish.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "products")
data class Product(
 @PrimaryKey(autoGenerate = true)   val id: Int = 0,
 val title: String,
 val description: String,
 val price: Double,
 val image: Int
): Serializable