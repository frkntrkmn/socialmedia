package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblposttotags")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PostToTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long postid;
    long tagsid;
}
