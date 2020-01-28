package org.decemrist.service.impl;

import org.decemrist.dto.UserDto;
import org.decemrist.mapper.UserToDtoMapper;
import org.decemrist.repository.UserRepository;
import org.decemrist.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	private UserToDtoMapper userToDtoMapper;
	private UserRepository userRepository;

	public UserServiceImpl(UserToDtoMapper userToDtoMapper,
						   UserRepository userRepository) {
		this.userToDtoMapper = userToDtoMapper;
		this.userRepository = userRepository;
	}

	@Override
	public List<UserDto> findAll() {
		final var users = userRepository.findAll();
		return userToDtoMapper.map(users);
	}

}
