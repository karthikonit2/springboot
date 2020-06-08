package com.appblog.app.ws.service;

import com.appblog.app.ws.shared.dto.UserDto;
import org.springframework.stereotype.Service;


public interface UserService {
    UserDto createUser(UserDto user);
}
