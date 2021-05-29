import com.sky.dao.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sky
 * @create 2021-05-29-17:14
 * @describe
 */
public class MyTest {


    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        UserMapper userMapper =
                context.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.queryUserById(1));
    }

}
