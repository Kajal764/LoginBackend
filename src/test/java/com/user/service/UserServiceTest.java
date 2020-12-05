package com.user.service;

import com.user.dto.RegisterUserDto;
import org.springframework.boot.test.context.SpringBootTest;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;



@SpringBootTest
public class UserServiceTest {

//    @Mock
//    UserRepository userRepository;
//
//    @Mock
//    BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @InjectMocks
//    @Autowired
//    UserServiceImpl userService;

    @Test
    public void givenUserDetails_WhenRegister_ItShouldReturnTrue() {
        RegisterUserDto registerUserDto = new RegisterUserDto("kajal", "waghmare", "kajalw1998@gmail.com", "Ahsa@123");
//        UserInfo userInfo = new UserInfo(registerUserDto);
//        when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());
        UserServiceImpl userService = new UserServiceImpl();
        boolean register = userService.register(registerUserDto);
        System.out.println(register);
    }
}
