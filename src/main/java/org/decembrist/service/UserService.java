package org.decembrist.service;

import org.decembrist.dto.UserDto;

import java.util.List;

public interface UserService {

	/**
	 * @return active user list
	 */
	List<UserDto> findAll();

}
