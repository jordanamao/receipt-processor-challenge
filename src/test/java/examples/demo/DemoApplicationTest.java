package examples.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.web.WebAppConfiguration;




@ExtendWith(MockitoExtension.class)
@WebAppConfiguration
class DemoApplicationTest {

    @Test
    public void contextLoads() {
    }
}

