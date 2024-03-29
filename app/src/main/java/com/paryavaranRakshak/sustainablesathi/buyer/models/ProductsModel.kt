package com.paryavaranRakshak.sustainablesathi.buyer.models

data class ProductsModel(
    val id: Int,
    val name: String,
    val image_link: String,
    val category: String,
    val subCategory: String,
    val description: String,
    val quantity: Int,
    val price: Double
)