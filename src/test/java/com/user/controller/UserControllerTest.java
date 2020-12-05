package com.user.controller;

import com.google.gson.Gson;
import com.user.service.UserServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserServiceTest userService;

    Gson gson = new Gson();

//    @Test
//    void givenRequestForRegister_WhenGetResponse_ItShouldReturnStatusOK() throws Exception {
//        RegisterUserDto registerUserDto = new RegisterUserDto("kajal", "waghmare", "kajalw341998@gmail.com", "Asha@123");
//        String toJson = gson.toJson(registerUserDto);
//        when(userService.register(registerUserDto)).thenReturn(true);
//        MvcResult mvcResult = this.mockMvc.perform(post("/user/register")
//                .content(toJson).contentType(MediaType.APPLICATION_JSON)).andReturn();
//        System.out.println(mvcResult.getResponse().getStatus());
//        System.out.println(mvcResult.getResponse().getContentAsString());
//    }
}
