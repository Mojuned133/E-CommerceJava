package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.config.JwtProvider;
import com.avisoft.ecommerce.exception.UserException;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService  {


    private UserRepository userRepository;
    private JwtProvider jwtProvider;

    public UserServiceImplementation(UserRepository userRepository, JwtProvider jwtProvider){

        this.userRepository=userRepository;
        this.jwtProvider=jwtProvider;
    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User>user=userRepository.findById(userId);
        if (user.isPresent()){
            return user.get();
        }
        throw new UserException("user not found with this id"+userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {

        String email=jwtProvider.getEmailFromToken(jwt);

        User user=userRepository.findByEmail(email);

        if(user==null){
            throw new UserException("usre not found with email"+email);
        }
        return user;
    }
}
