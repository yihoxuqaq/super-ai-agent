package top.yihoxu.aiagentbackend.tool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yihoxu
 * @date 2025/5/13  14:33
 * @description todo
 */
class ResourceDownloadToolTest {

    private final String URL= """
          https://www.codefather.cn/logo.png
            """;
    @Test
    void downloadResource() {
        ResourceDownloadTool resourceDownloadTool = new ResourceDownloadTool();
        String s = resourceDownloadTool.downloadResource(URL, "海绵宝宝.png");
        Assertions.assertNotNull(s);
    }
}