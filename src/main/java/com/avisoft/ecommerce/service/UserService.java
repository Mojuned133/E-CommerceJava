package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.UserException;
import com.avisoft.ecommerce.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;


}
