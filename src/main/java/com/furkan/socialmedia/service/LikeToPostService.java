package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.LikeToPostRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.LikeToPost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LikeToPostService {

    private final LikeToPostRepository likeToPostRepository;

    public void save(LikeToPost item){
        likeToPostRepository.save(item);
    }
    public void update(LikeToPost item){
        likeToPostRepository.save(item);
    }
    public void delete(long id){
        likeToPostRepository.deleteById(id);
    }
    public List<LikeToPost> findall(long id){
        return likeToPostRepository.findAll();
    }
    public Optional<LikeToPost> findById(long id){
        return likeToPostRepository.findById(id);

    }

}
