package com.example.mymemory.models

data class MemoryCard(
    val identifier: Int,
    val imageUr: String? = null,
    var isFaceUp: Boolean = false,
    var isMatched: Boolean = false
)