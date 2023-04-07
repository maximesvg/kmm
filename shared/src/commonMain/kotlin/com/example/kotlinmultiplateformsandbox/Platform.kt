package com.example.kotlinmultiplateformsandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform