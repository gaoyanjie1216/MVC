package spring;

import com.gyj.mvc.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Gao on 2018/4/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext3.xml")
public class TransactionTest {

    /**
     * 一定要注入代理类:因为代理类进行增强的操作
     */
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
