package org.decembrist.service.impl;

import org.decembrist.dto.UserDto;
import org.decembrist.mapper.UserToDtoMapper;
import org.decembrist.repository.UserRepository;
import org.decembrist.service.UserService;
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
