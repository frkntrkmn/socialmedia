package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.LikeToPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeToPostRepository extends JpaRepository<LikeToPost,Long> {
}
