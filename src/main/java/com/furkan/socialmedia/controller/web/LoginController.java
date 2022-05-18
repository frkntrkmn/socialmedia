package com.furkan.socialmedia.controller.web;

import com.furkan.socialmedia.model.ModelLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// restte iken restcontroller eklenir
// burada sadece controller
@RequestMapping("/login")
public class LoginController {

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
        view.addObject("bunucagirmanlazimattributeyi",ModelLogin.builder()
                .title("kullanici giris sayfasi")
                .loginbutton("giris yap butonu")
                .password("sifre")
                .username("kullanici adi")
                .build()
        );
        return view;

    }
}
