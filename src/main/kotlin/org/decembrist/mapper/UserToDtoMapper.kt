package org.decembrist.mapper

import org.decembrist.domain.User
import org.decembrist.dto.UserDto
import org.springframework.stereotype.Service

//@Component
@Service
class UserToDtoMapper : Mapper<User?, UserDto?> {

    override fun map(source: User?): UserDto? {
        if (source == null) {
            return null
        }
        val userDto = UserDto()
        userDto.id = source.id
        userDto.email = source.email
        userDto.name = source.username
        return userDto
    }

}
