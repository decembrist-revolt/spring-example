package org.decembrist.mapper;

import org.decembrist.domain.User;
import org.decembrist.dto.UserDto;
import org.springframework.stereotype.Service;

//@Component
@Service
public class UserToDtoMapper implements Mapper<User, UserDto> {

	@Override
	public UserDto map(User source) {
		if (source == null) {
			return null;
		}
		final var userDto = new UserDto();
		userDto.setId(source.getId());
		userDto.setEmail(source.getEmail());
		userDto.setName(source.getUsername());
		return userDto;
	}

}
