package top.yihoxu.aiagentbackend.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;
import top.yihoxu.aiagentbackend.demo.constants.AliYunConfig;
/**
 * @author yihoxu
 * @date 2025/4/28  14:07
 * @description LangChain4j 调用
 */
public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(AliYunConfig.API_KEY)
                .modelName("qwen-max")
                .build();
        String answer = qwenModel.chat("你好！你是谁");
        System.out.println(answer);
    }
}
