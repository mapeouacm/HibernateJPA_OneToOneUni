package mx.edu.uacm.hibernatejpaonetooneuni.entity;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PhoneTest {
    
    @Autowired
    private EntityManager entityManager;

    @Test
    public void mustSavePhoneTest(){

        entityManager.getTransaction().begin();

        Phone phone = new Phone("292893838");
        entityManager.persist(phone);

        PhoneDetails details = new PhoneDetails("Movistar", "fijo");
        entityManager.persist(details);

        entityManager.flush();

        entityManager.getTransaction().commit();

        entityManager.close();


    }
}
