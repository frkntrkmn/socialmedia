package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.FallowRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.Fallow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FallowService {

    private final FallowRepository fallowRepository;

    public void save(Fallow item){
        fallowRepository.save(item);
    }
    public void update(Fallow item){
        fallowRepository.save(item);
    }
    public void delete(long id){
        fallowRepository.deleteById(id);
    }
    public List<Fallow> findall(long id){
        return fallowRepository.findAll();
    }
    public Optional<Fallow> findById(long id){
        return fallowRepository.findById(id);

    }

}
