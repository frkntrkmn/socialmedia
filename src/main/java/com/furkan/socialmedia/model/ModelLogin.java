package com.furkan.socialmedia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * login sayfasından görsel olarak ne görmek istiyorsak
 * onların bilgilerini giriyoruz
 * ben bu bilgileri sayfaya gönderecegim sayfada olmasını istiyoruz
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelLogin {
    String title;
    String loginbutton;
    String username;
    String password;
}
