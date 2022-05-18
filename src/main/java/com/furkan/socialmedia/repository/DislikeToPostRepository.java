package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.DislikeToPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DislikeToPostRepository extends JpaRepository<DislikeToPost,Long> {
}
