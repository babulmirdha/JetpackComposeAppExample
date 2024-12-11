package com.babulmirdha.kmapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform