package com.example.simplefood3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform