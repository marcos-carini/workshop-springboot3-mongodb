package com.marcosvinicius.workshopmongo.services;

import com.marcosvinicius.workshopmongo.domain.User;
import com.marcosvinicius.workshopmongo.repository.UserRepository;
import com.marcosvinicius.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return  repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
