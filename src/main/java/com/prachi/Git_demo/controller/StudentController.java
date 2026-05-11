package com.prachi.Git_demo.controller;

import com.prachi.Git_demo.model.Student;
import com.prachi.Git_demo.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private ServiceStudent service;

    @GetMapping
    public List<Student> getAll() { return service.getAll(); }

    @PostMapping
    public Student create(@RequestBody Student s) { return service.save(s); }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student s) {
        return service.update(id, s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
