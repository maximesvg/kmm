package com.example.kotlinmultiplateformsandbox

import kotlinx.serialization.Serializable

@Serializable
data class PokemonListResponse(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResponse>?
)

@Serializable
data class PokemonResponse(
    val name: String?,
    val url: String?
)