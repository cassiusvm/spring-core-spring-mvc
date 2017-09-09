package guru.springframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringmvcApplication.class)
@WebAppConfiguration
public class SpringmvcApplicationTests {

	@Test
	public void contextLoads() {
	}

}
