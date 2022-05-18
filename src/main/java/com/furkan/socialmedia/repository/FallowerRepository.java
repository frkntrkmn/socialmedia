package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.Fallower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FallowerRepository extends JpaRepository<Fallower,Long> {
}
