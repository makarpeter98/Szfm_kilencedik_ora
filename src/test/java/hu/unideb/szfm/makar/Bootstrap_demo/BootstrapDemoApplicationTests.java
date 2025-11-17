package hu.unideb.szfm.makar.Bootstrap_demo;

import hu.unideb.szfm.makar.Bootstrap_demo.model.Person;
import hu.unideb.szfm.makar.Bootstrap_demo.model.PersonRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class BootstrapDemoApplicationTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    void testPersonAdd()
    {

    }
}
