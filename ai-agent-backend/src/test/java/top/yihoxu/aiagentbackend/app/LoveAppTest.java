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

    @Test
    void doChatWithTools() {
        // 测试联网搜索问题的答案
     //   testMessage("周末想带女朋友去上海约会，推荐几个适合情侣的小众打卡地？");

//        // 测试网页抓取：恋爱案例分析
//        testMessage("最近和对象吵架了，看看编程导航网站（codefather.cn）的其他情侣是怎么解决矛盾的？");
//
        // 测试资源下载：图片下载
        testMessage("直接下载一张适合做手机壁纸的星空情侣图片为文件");
//
//        // 测试终端操作：执行代码
//        testMessage("执行 Python3 脚本来生成数据分析报告");
//
//        // 测试文件操作：保存用户档案
//        testMessage("保存我的恋爱档案为文件");
//
//        // 测试 PDF 生成
//        testMessage("生成一份‘七夕约会计划’PDF，包含餐厅预订、活动流程和礼物清单");
    }

    private void testMessage(String message) {
        String chatId = UUID.randomUUID().toString();
        String answer = loveApp.doChatWithTools(message, chatId);
        Assertions.assertNotNull(answer);
    }

}