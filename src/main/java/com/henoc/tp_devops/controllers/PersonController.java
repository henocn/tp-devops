package com.henoc.tp_devops.controllers;
import com.henoc.tp_devops.models.Person;
import com.henoc.tp_devops.payload.ApiResponse;
import com.henoc.tp_devops.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @GetMapping("/")
    public String redirect() {
        return "redirect:/api/persons";
    }

    @Autowired
    private PersonService service;

    @GetMapping
    public ApiResponse findAllPersons() {
        return new ApiResponse(200, "Success", service.getAllPersons());
    }

    @GetMapping("/{id}")
    public ApiResponse getPersonById(@PathVariable Long id) {
        return new ApiResponse(200, "Success", service.getPersonById(id));
    }

    @GetMapping("/tel/{tel}")
    public ApiResponse findPersonByTel(@PathVariable String tel) {
        return new ApiResponse(200, "Success", service.getPersonByTel(tel));
    }

    @PostMapping
    public ApiResponse createPerson(@RequestBody Person p) {
        return new ApiResponse(201, "Created", service.createPerson(p));
    }

    @DeleteMapping("/{id}")
    public ApiResponse deletePerson(@PathVariable Long id) {
        service.deletePerson(id);
        return new ApiResponse(204, "Deleted", null);
    }
}
