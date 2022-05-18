package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblfallower")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Fallower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    /**
     * takip edilen kişi
     */
    long userid;
    /**
     * user id yi takip eden kişi
     */
    long followerid;
    int status;
}
