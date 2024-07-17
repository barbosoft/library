package com.example.library.services;


import com.example.library.models.Rol;
import com.example.library.models.User;
import com.example.library.dto.UserRegisterDTO;
import com.example.library.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegisterDTO registerDTO) {
        User user = new User(registerDTO.getName(), registerDTO.getLastName(), registerDTO.getEmail(), registerDTO.getPassword(), Arrays.asList(new Rol()));

        return userRepository.save(user);
    }
}
