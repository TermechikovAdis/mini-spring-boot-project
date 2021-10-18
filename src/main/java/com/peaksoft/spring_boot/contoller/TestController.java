package com.peaksoft.spring_boot.contoller;

import com.peaksoft.spring_boot.model.GetId;
import com.peaksoft.spring_boot.model.User;
import com.peaksoft.spring_boot.repo.GetIdRepository;
import com.peaksoft.spring_boot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

@Controller
@RequestMapping("/api")
public class TestController {


    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private GetIdRepository getIdRepository;

    @GetMapping("/admin")
    public String get(Principal principal){
        User user = userService.loadUserByFirstName(principal.getName());
        getIdRepository.save(new GetId(user.getId()));
        return "admin";
    }

    @GetMapping("/user")
    public String get2(Principal principal){
        User user = userService.loadUserByFirstName(principal.getName());
        getIdRepository.save(new GetId(user.getId()));
        return "user";

    }
}

