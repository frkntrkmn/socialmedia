package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.PostRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import com.furkan.socialmedia.repository.entity.LikeToPost;
import com.furkan.socialmedia.repository.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public void save(Post item){
        postRepository.save(item);
    }
    public void update(Post item){
        postRepository.save(item);
    }
    public void delete(long id){
        postRepository.deleteById(id);
    }
    public List<Post> findall(long id){
        return postRepository.findAll();
    }
    public Optional<Post> findById(long id){
        return postRepository.findById(id);

    }

}
