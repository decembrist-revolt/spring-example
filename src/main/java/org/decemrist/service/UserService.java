package org.decemrist.service;

import org.decemrist.dto.UserDto;

import java.util.List;

public interface UserService {

	/**
	 * @return active user list
	 */
	List<UserDto> findAll();

}
