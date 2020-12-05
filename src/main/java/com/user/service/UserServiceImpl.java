package com.user.service;

import com.user.dto.LoginUserDto;
import com.user.dto.RegisterUserDto;
import com.user.exception.LoginException;
import com.user.model.UserInfo;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bcryptPasswordEncoder;

    @Override
    public boolean register(RegisterUserDto registerUserDto) {
        registerUserDto.password = bcryptPasswordEncoder.encode(registerUserDto.password);
        UserInfo userInfo = new UserInfo(registerUserDto);
        Optional<UserInfo> user = userRepository.findByEmail(registerUserDto.email);
        if (user.isPresent())
            return false;
        userRepository.save(userInfo);
        return true;
    }

    @Override
    public boolean login(LoginUserDto loginUserDto) {

        Optional<UserInfo> userInfo = userRepository.findByEmail(loginUserDto.email);
        if (userInfo.isEmpty()) {
            throw new LoginException("No such account found", 400);
        }
        if (userInfo.get().getEmail().equals(loginUserDto.email)) {
            if (bcryptPasswordEncoder.matches(loginUserDto.password, userInfo.get().getPassword())) {
                return true;
            }
            throw new LoginException("User name or password might be wrong", 400);
        }
        return false;
    }
}
