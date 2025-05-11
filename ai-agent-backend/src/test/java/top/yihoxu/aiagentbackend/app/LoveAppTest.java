package top.yihoxu.aiagentbackend.app;

import cn.hutool.core.lang.UUID;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yihoxu
 * @date 2025/4/28  21:18
 * @description 恋爱应用测试
 */
@SpringBootTest
class LoveAppTest {

    @Resource
    private LoveApp loveApp;

    @Test
    void testDoChat(){
        String chatId = UUID.randomUUID().toString();
        String answer1 = loveApp.doChat("你好", chatId);
        System.out.println(answer1);
        String answer2 = loveApp.doChat("你好，我的另一半对象叫张三", chatId);
        System.out.println(answer2);
        String answer3 = loveApp.doChat("我忘记了我另一半叫什么名字了，你能告诉一下吗", chatId);
        System.out.println(answer3);

    }
    @Test
    void testDoChatWithReport(){
        String userMessage="我叫张三，最近我的另一半对我的态度冷淡我该怎么办？";
        String chatId = UUID.randomUUID().toString();
        LoveApp.LoveReport loveReport = loveApp.doChatWithReport(userMessage, chatId);
        Assertions.assertNotNull(loveReport);


    }

    @Test
    void doChatWithRag() {
        String uuid = UUID.randomUUID().toString();
        String message="我单身很久了，最近想谈一场甜甜的恋爱，我想找的另一半对象是跟我星座相同、兴趣相同的。我的生日是4月8日，我的爱好是跑酷";
        String answer = loveApp.doChatWithRag(message, uuid);
        Assertions.assertNotNull(answer);


    }
}