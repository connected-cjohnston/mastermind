package com.example.mastermind.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/game")
class GameController {

    @GetMapping("/new")
    fun newGame(): String {
        return "New game"
    }
}
