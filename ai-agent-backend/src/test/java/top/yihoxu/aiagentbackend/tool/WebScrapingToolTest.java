package top.yihoxu.aiagentbackend.tool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yihoxu
 * @date 2025/5/13  14:23
 * @description todo
 */
class WebScrapingToolTest {

    @Test
    void scrapeWebPage() {
        WebScrapingTool webScrapingTool = new WebScrapingTool();
        String s = webScrapingTool.scrapeWebPage("https://www.4399.com");
        Assertions.assertNotNull(s);
    }
}