package top.yihoxu.aiagentbackend.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author yihoxu
 * @date 2025/4/28  14:07
 * @description spring ai 调用
 */
//@Component
public class SpringAiInvoke implements CommandLineRunner {
    @Resource
    private ChatModel dashcopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = dashcopeChatModel.call(new Prompt("你是你是谁"))
                .getResult()
                .getOutput();
        System.out.println(output.getText());
    }
}
