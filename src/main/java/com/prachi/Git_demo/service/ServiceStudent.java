package com.prachi.Git_demo.service;

import com.prachi.Git_demo.model.Student;
import com.prachi.Git_demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceStudent {
    @Autowired
    private StudentRepository repo;

    public List<Student> getAll() { return repo.findAll(); }
    public Student save(Student s) { return repo.save(s); }
    public void delete(Long id) { repo.deleteById(id); }
    public Student update(Long id, Student s) {
        s.setId(id);
        return repo.save(s);
    }
}
