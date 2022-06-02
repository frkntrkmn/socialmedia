package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * POJO ile iligi eklenmesi gerekn kodların
 * karmaşıklığını azaltmak ve daha kolay bir
 * kullanım sağlamak amacıyla Lombok Porject
 * geliştirilmiştir. Kullanım için anotasyonlarını
 * eklemek yeterlidir.
 */
@Table(name = "tbluser")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   long id;
    String name;
    String surname;
    String borndate;
    String email;
    String password;
    String phone;
    String avatar;
    String gender;
    String city;
    String country;
    String phonetoken;
    long createprofile;
}
