package com.appblog.app.ws.service;

import com.appblog.app.ws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
