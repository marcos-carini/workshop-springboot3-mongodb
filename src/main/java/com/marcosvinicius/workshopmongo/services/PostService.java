package com.marcosvinicius.workshopmongo.services;

import com.marcosvinicius.workshopmongo.domain.Post;

import com.marcosvinicius.workshopmongo.repository.PostRepository;
import com.marcosvinicius.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.searchTitle(text);
    }
}
