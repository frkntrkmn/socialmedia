package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblliketopost")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LikeToPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long userid;
    long postid;
}
