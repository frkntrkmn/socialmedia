package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.TagsRepository;
import com.furkan.socialmedia.repository.entity.PostToTags;
import com.furkan.socialmedia.repository.entity.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TagsService {
    private final TagsRepository tagsRepository;


    public void save(Tags item){
        tagsRepository.save(item);
    }
    public void update(Tags item){
        tagsRepository.save(item);
    }
    public void delete(long id){
        tagsRepository.deleteById(id);
    }
    public List<Tags> findall(long id){
        return tagsRepository.findAll();
    }
    public Optional<Tags> findById(long id) {
        return tagsRepository.findById(id);
    }
    }
