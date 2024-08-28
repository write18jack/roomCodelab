package com.example.inventory.data

import java.io.Serializable

data class ItemWithDetail(
    val item: Item,
    val detail: Detail
): Serializable
