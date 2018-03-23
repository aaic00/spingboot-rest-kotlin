package vip.aaic.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestKotlinApplication

fun main(args: Array<String>) {
    runApplication<RestKotlinApplication>(*args)
    val a = ""
    a.isEmpty()

}
