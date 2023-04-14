package com.example.kotlinmultiplateformsandbox

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class Network {

    suspend fun getPokemonList(): PokemonListResponse {
        val client = HttpClient(CIO)
        val response: HttpResponse = client.get("https://pokeapi.co/api/v2/pokemon")
        client.close()
        val json = response.bodyAsText()
        return Json.decodeFromString(json)
    }
}