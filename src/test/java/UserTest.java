import com.alibaba.fastjson.JSON;
import com.spring.pojo.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhb on 2017/2/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class UserTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void usertest(){
        User user = userService.getUserById(1);
        LOGGER.info(JSON.toJSONString(user));
    }
}
