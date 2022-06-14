package com.furkan.socialmedia.repository;

import com.furkan.socialmedia.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * hibernate kendimiz extends edilmişi kontrol ediyoruz ama burada
     * jparepository de kontrol edemiyoruz
     * özel bir sorgu yöntemi gerekiyor jparepository için
     * bu özel methodları kullanmak için bu siteye gidiyoruz:
     * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
     * spring bu özel methodlarla şunu yapar
     * sizin girdiginiz method adından sorgu çıkarır
     * 1_find yazılacak
     * 2_by yazılacak
     * 3_entity içindeki tanımlagınız degişken adına göre yazılacak
     * !!!! örnegin entity adı "username" olsun
     * ilk harf büyük yazmak zorundasun "Username"
     * entity harfi büyük olmassa spring bunu by ile bitişik algılıyor
     * 4_ daha sonra and veya or kullanmalısın
     * 5_ bu methodun adını oluşturur >>> findByUsernameAndPassword(){      }
     * son dikkkat !!!! method aramasında yapılan arama ile bilgi alacak kısım sıralaması aynıdır yani:
     *  findByUsernameAndPassword(String username,String password)
     *  veya
     *  findByUsernameOrPassword(String kullaniciadi,String sifre) de olabilir
     *  ilk kısmı username e gidecek ikinci kısmı passworde gidecek bu kadar alınan bilgi adının önemi yok önemli
     *  olan sıralamadır
     */


    /**
     * sorguların çeşitleri nelerdir:
     * like olan mesela: il yazıyorum arama yerine il ile başlayan isimleri
     * veya neyi arıyorsan artık il ile başlayanları arıyor
     * mesela List<User>findByNameLike(String name) yazarız
     * uygulamamız da arama yerine il yazarız ismi il ile başlayanları getirir
     * ilay, ilayda, ileyda,ilknur vs...
     *
     * -- native quary ile de kendi sorgunu oluşturabiliriz
     */


    /**
     * genelde optional kullanırız çünkü optional null değer alabilir
     * sormal userfindByUsername(String username) yazabiliriz ama arama yaptıgımızda
     * hiçbir deger yoksa sorun ile karşılaşabiliriz
     */

    Optional<User> findOptionalByUsernameAndPassword(String username, String password);
    List<User> findByNameLike (String name);



}
