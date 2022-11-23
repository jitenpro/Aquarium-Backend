package com.projects.aquarium.controller;

import com.projects.aquarium.dto.ResponseDto;
import com.projects.aquarium.dto.user.SignInDto;
import com.projects.aquarium.dto.user.SignInResponseDto;
import com.projects.aquarium.dto.user.SignupDto;
import com.projects.aquarium.dto.user.UserCreateDto;
import com.projects.aquarium.entity.User;
import com.projects.aquarium.exceptions.AuthenticationFailException;
import com.projects.aquarium.exceptions.CustomException;
import com.projects.aquarium.repository.TokenRepository;
import com.projects.aquarium.repository.UserRepository;
import com.projects.aquarium.service.AuthenticationService;
import com.projects.aquarium.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TokenRepository tokenRepository;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    UserService userService;
    private String id;

    @GetMapping("/all")
    public List<User> findAllUser(@RequestParam("token") String token) throws AuthenticationFailException {
        authenticationService.authenticate(token);
        return userRepository.findAll();
    }

    @GetMapping("/currentUser")
    public User findUser(@RequestParam("token") String token) throws AuthenticationFailException {
        authenticationService.authenticate(token);
        return tokenRepository.findUserByToken(token).getUser();
    }

    @PostMapping("/signup")
    public ResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    //TODO token should be updated
    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException {
        return userService.signIn(signInDto);
    }

//    @PostMapping("/updateUser")
//    public ResponseDto updateUser(@RequestParam("token") String token, @RequestBody UserUpdateDto userUpdateDto) {
//        authenticationService.authenticate(token);
//        return userService.updateUser(token, userUpdateDto);
//    }


    @PostMapping("/createUser")
    public ResponseDto updateUser(@RequestParam("token") String token, @RequestBody UserCreateDto userCreateDto)
            throws CustomException, AuthenticationFailException {
        authenticationService.authenticate(token);
        return userService.createUser(token, userCreateDto);
    }
}
