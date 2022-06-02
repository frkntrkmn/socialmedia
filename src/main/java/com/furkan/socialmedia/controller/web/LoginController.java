package com.furkan.socialmedia.controller.web;

import com.furkan.socialmedia.model.ModelLogin;
import com.furkan.socialmedia.repository.entity.User;
import com.furkan.socialmedia.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RequiredArgsConstructor
@Controller
@RequestMapping("/login")
public class LoginController {

   private final UserService userService;
    //bu sayfanın direk karşımızıa gelmesini istiyoruz bu yüzden
    // get mapping de ekstra bir adres vermiyoruz
    @GetMapping("")
    /**
     * model ve view ı al ve bunu dön controller in temel mantıgıas
     * modeli ve view ı alıp bunları birleştirip kullanıcıya sunar
     */
    public ModelAndView index(){

        /**
         * burada hem modele hemde view e ihtiyacımız var
         * elimizde view var login.html olarak
         * buna birde model vericez ve tamamdır
         * bu kullanıcıya bu ikisini birleştirip göstericek
         */
        ModelAndView view= new ModelAndView();
        //view.set dedigimiz işlem templates in altına bakar
        // view veriliyor burada login sayfasını al şeklinde
        view.setViewName("login");

        /**
         * burada da modeli veriyoruz
         * html sayfasına gönderilmek üzere adı "model" olan bir
         * nesne gönderiyor
         * gönderilen nesne yönetim açısından kolay olması için tek
         * model içinde bütün bilgileri gönderiyoruz
         * şöylede gönderilebilir:>>>>
         * view.addObject("title","kullanıcı adı"+ kullanici sayfasi, kullanici adi)
         * gibi de gönderilebilir ama model altında gönderilmesi yönetimi ve
         * anlaşılabilir olmasını sağlıyor
         */
        view.addObject("model", ModelLogin.builder()
                .title("kullanici giris sayfasi")
                .username("kullanici adi")
                .password("sifre")
                .loginbutton("giris yap butonu").build()
        );
        return view;

    }

    @PostMapping("/register")
   public Object register(String firstname,String lastname, String email,String password,int day,
                          int month,int year,boolean gender, String city, String country){
        userService.save(User.builder()
                        .avatar("")
                        .borndate(year+"")
                        .createprofile(new Date().getTime())
                        .email(email)
                        .name(firstname+" "+lastname)
                        .city(city)
                        .country(country)
                        .gender(gender ? "erkek" : "kadın")
                        .password(password)
                .build());

        return "redirect:/login";
    }



}
