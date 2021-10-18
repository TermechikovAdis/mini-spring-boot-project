package com.peaksoft.spring_boot.contoller;

import com.peaksoft.spring_boot.model.GetId;
import com.peaksoft.spring_boot.model.User;
import com.peaksoft.spring_boot.repo.GetIdRepository;
import com.peaksoft.spring_boot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private GetIdRepository getIdRepository;

    @CrossOrigin
    @GetMapping("/test/{id}")
    public String test(@PathVariable Long id){
        return "loading";
    }
    @CrossOrigin
    @GetMapping
    public User getUser(){
        List<GetId> ids = getIdRepository.findAll();
        GetId getId = ids.get(ids.size()-1);
        User user =  userService.findById(getId.getId());
        return user;
    }
    @CrossOrigin
    @GetMapping("/get_id")
    public User getUserId(){
        List<GetId> ids = getIdRepository.findAll();
        GetId getId = ids.get(ids.size()-1);
        User user =  userService.findById(getId.getGet_id());
        System.out.println(user.getFirstName());
        System.out.println(user);
        System.out.println(user.getAge());
        return user;
    }
}
