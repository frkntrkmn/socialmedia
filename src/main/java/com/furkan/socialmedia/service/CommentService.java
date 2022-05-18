package com.furkan.socialmedia.service;


import com.furkan.socialmedia.repository.CommentRepository;
import com.furkan.socialmedia.repository.entity.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Lombok içinde bnulunan bu annotasyon ile zorunlu olarak oluşturulmasu
 * gerekli olan constructor ların lombok trarafından yazılması sağlanır.
 * sınıf içinde final olarak tanımlanan değişkenler için geçerlidir.
 */
@RequiredArgsConstructor
@Service
public class CommentService {
    /**
     * DİKKAT!!!
     * Spring nesneleri compilertime da kendisi rast gele üretmek üzere
     * @Autowired annotasyonu kullanır. ancak nesne tutarlılığı ve günveliği
     * açısından, nesnelerin final kullanırak değişmezliğinin garanti edilmesi
     * ve constructor içerisinde nesne yaratılması önerilir.
     * yani final olunca bunu da bu nesneler ile birlikte yarat
     * bekleme yani
     */

    private final CommentRepository commentRepository;


    public void save(Comment item){
       commentRepository.save(item);
    }
    public void update(Comment item){
        commentRepository.save(item);
    }
    public void delete(long id){
        commentRepository.deleteById(id);
    }
    public List<Comment> findall(long id){
        return commentRepository.findAll();
    }

    /**
     * Optional -> içerisinde bulunan varlığın değerinin analizini ve
     * kullanacaklar için tutarlılığını kontrol eder. bazen kullanmakta
     * olduğumuz nesneler null gelirse uygulamamız çalışma zamanında
     * bunu tolere edemez ve uygulama down olur. bu istemediğimiz bir durumdur.
     * bu nedenle optional kullanmak faydalıdır.
     *  kontrolü saglamak için yapılmıştır
     * find by ıd opsiyonel olarak çekiyor
     * bunun içerisinde bir şey var mı yok mu bakmak zorunda degil
     * bir deger varsa true döner
     */
    public Optional<Comment> findById(long id){
        return commentRepository.findById(id);

    }



}
