package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.Fallow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FallowRepository extends JpaRepository<Fallow,Long> {
}
