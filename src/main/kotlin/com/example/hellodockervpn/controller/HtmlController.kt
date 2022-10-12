package com.example.hellodockervpn.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.io.File
import java.io.InputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter





@Controller
class HtmlController {

    @GetMapping("/")
    fun hello(model: Model): String {

        //val inputStream: InputStream = File("./src/main/resources/static/WhoAmI/WhoAmI.txt").inputStream()
        val inputStream: InputStream = File("./WhoAmI/WhoAmI.txt").inputStream()
        val whoAmI = inputStream.bufferedReader().use { it.readText() }

        val time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))

        model.addAttribute("time", time);
        model.addAttribute("whoAmI", whoAmI);

        return "helloPage"
    }

}