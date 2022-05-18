package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblpost")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long userid;
    String userphoto;
    String username;
    long sharedtime;
    String content;
    @Column(length = 5000)
    String url;
    int likecount;
    int dislike;
    int commentcount;
    boolean islike;
    boolean isdislike;

}
