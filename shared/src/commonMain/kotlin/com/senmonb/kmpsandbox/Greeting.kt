package com.senmonb.kmpsandbox

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "HI!" else "Hello!"

        return "$firstWord Guess what this is! > ${platform.name.reversed()}!"
    }
}