import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.test.context.junit4.SpringRunner;

import com.psj.starter.App;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class TestProxy {
    @Test
    public void testLogProxy(){
//        LogHandle handler = new LogHandler();
//        UserManager userManager  = (UserManager) handler.newProxyInstance(new UserManagerImpl());
//        String res = userManager.login("psj");
//        String del = userManager.delUser("psj");
//        System.out.println("登陆id----："+res);
//        System.out.println("删除id----："+del);
    }

    @Test
    public void testCglibProxy(){
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserManagerImpl.class);
//        enhancer.setCallback(new CglibProxy());
//        UserManagerImpl res = (UserManagerImpl) enhancer.create();
//        res.login("psj");
    }
}
