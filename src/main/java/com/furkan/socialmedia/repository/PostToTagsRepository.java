package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.PostToTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostToTagsRepository extends JpaRepository<PostToTags,Long> {
}
