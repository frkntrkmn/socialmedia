package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.FallowerRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.Fallower;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FallowerService {

    private final FallowerRepository fallowerRepository;

    public void save(Fallower item){
        fallowerRepository.save(item);
    }
    public void update(Fallower item){
        fallowerRepository.save(item);
    }
    public void delete(long id){
        fallowerRepository.deleteById(id);
    }
    public List<Fallower> findall(long id){
        return fallowerRepository.findAll();
    }
    public Optional<Fallower> findById(long id){
        return fallowerRepository.findById(id);

    }

}
