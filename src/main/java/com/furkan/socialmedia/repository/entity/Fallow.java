package com.furkan.socialmedia.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblfallow")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
/**
 * Kişinin takip ettiği kullancılar
 */
public class Fallow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long userid;
    long fallowid;
    /**
     * Eğer bir kişi bir kişiyi takip etmiyorsa
     * bu değer ya hiç yoktur yada 0 dır
     * 0-> takip etmiyor
     * 1-> takip ediyor
     * 2-> takip isteği göndermiş onayda bekliyor.
     */
    int status;
}
