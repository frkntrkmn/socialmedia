package com.furkan.socialmedia.service;

import com.furkan.socialmedia.repository.UserRepository;
import com.furkan.socialmedia.repository.entity.Tags;
import com.furkan.socialmedia.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void save(User item){
        userRepository.save(item);
    }
    public void update(User item){
        userRepository.save(item);
    }
    public void delete(long id){
        userRepository.deleteById(id);
    }
    public List<User> findall(long id){
        return userRepository.findAll();
    }
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }
}
