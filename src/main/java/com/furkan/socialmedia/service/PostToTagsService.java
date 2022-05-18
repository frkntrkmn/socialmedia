package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.PostToTagsRepository;
import com.furkan.socialmedia.repository.entity.Post;
import com.furkan.socialmedia.repository.entity.PostToTags;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostToTagsService {

    private final PostToTagsRepository postToTagsRepository;

    public void save(PostToTags item){
        postToTagsRepository.save(item);
    }
    public void update(PostToTags item){
        postToTagsRepository.save(item);
    }
    public void delete(long id){
        postToTagsRepository.deleteById(id);
    }
    public List<PostToTags> findall(long id){
        return postToTagsRepository.findAll();
    }
    public Optional<PostToTags> findById(long id){
        return postToTagsRepository.findById(id);

    }
}
