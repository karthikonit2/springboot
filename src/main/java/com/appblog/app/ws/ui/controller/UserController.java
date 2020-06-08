package com.appblog.app.ws.ui.controller;

import com.appblog.app.ws.service.UserService;
import com.appblog.app.ws.shared.dto.UserDto;
import com.appblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appblog.app.ws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public String getUser(){
        return "Get User was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetails,userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "Update User was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete User was called";
    }

}
