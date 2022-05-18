package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.CommentRepository;
import com.furkan.socialmedia.repository.DislikeToPostRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.DislikeToPost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DislikeToPostService {

    private final DislikeToPostRepository dislikeToPostRepository;

    public void save(DislikeToPost item){
        dislikeToPostRepository.save(item);
    }
    public void update(DislikeToPost item){
        dislikeToPostRepository.save(item);
    }
    public void delete(long id){
        dislikeToPostRepository.deleteById(id);
    }
    public List<DislikeToPost> findall(long id){
        return dislikeToPostRepository.findAll();
    }
    public Optional<DislikeToPost> findById(long id){
        return dislikeToPostRepository.findById(id);

    }

}
