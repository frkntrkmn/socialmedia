package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends JpaRepository<Tags,Long> {
}
