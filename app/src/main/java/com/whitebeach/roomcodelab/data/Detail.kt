package com.example.inventory.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "detail",
    foreignKeys = [
        ForeignKey(
            entity = Item::class,
            parentColumns = ["id"],
            childColumns = ["itemId"],
            onDelete = ForeignKey.CASCADE
            )
    ],
    indices = [
        Index(value = ["itemId"])
    ]
)
data class Detail(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val price: Double,
    val quantity: Int,
    val itemId: Int
): Serializable
