package org.decemrist.mapper;

import org.decemrist.domain.User;
import org.decemrist.dto.UserDto;
import org.springframework.stereotype.Component;
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
