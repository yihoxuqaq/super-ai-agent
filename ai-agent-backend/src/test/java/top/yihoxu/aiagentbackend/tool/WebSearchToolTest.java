package top.yihoxu.aiagentbackend.tool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yihoxu
 * @date 2025/5/13  14:11
 * @description todo
 */
@SpringBootTest
class WebSearchToolTest {

    @Value("${search-api.api-key}")
    private String apiKey;

    @Test
    void searchWeb() {
        WebSearchTool webSearchTool = new WebSearchTool(apiKey);
        String s = webSearchTool.searchWeb("阿里云");
        Assertions.assertNotNull(s);
    }
}