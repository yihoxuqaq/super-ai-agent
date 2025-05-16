package top.yihoxu.aiagentbackend.tool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yihoxu
 * @date 2025/5/13  13:59
 * @description todo
 */
class FileOperationToolTest {

    @Test
    void readFile() {
        FileOperationTool fileOperationTool = new FileOperationTool();
        String result = fileOperationTool.readFile("工具.txt");
        Assertions.assertNotNull(result);
    }

    @Test
    void writeFile() {
        FileOperationTool fileOperationTool = new FileOperationTool();
        String result = fileOperationTool.writeFile("工具.txt", "这个是一个工具");
        Assertions.assertNotNull(result);
    }
}