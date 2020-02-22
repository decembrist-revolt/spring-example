package org.decembrist.mapper

import org.decembrist.domain.User
import org.decembrist.dto.UserDto
import org.springframework.stereotype.Service

//@Component
@Service
class UserToDtoMapper : Mapper<User?, UserDto?> {

    override fun map(source: User?): UserDto? {
        return source?.let { user ->
            UserDto(user.id, user.email, user.username)
        }
    }

}
