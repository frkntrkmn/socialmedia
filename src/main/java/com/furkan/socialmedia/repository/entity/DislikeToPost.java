package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbldisliketopost")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DislikeToPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long postid;
    long userid;
}
