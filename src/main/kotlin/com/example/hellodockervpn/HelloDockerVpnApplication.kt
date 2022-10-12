package com.example.hellodockervpn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloDockerVpnApplication

fun main(args: Array<String>) {
    runApplication<HelloDockerVpnApplication>(*args)
}
