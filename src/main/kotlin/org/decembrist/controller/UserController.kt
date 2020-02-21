package org.decembrist.controller

import org.decembrist.HelloKotlin
import org.decembrist.dto.UserDto
import org.decembrist.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @RequestMapping(method = [RequestMethod.GET])
    fun findAll(): List<UserDto> {
        return userService.findAll()
    }

    @GetMapping("/kotlin")
    fun helloKotlin(): String {
        return HelloKotlin().helloKotlin()
    }

}
