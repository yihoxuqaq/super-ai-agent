package top.yihoxu.aiagentbackend.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yihoxu
 * @date 2025/5/13  14:48
 * @description todo
 */
class PDFGenerationToolTest {


        @Test
        public void testGeneratePDF() {
            PDFGenerationTool tool = new PDFGenerationTool();
            String fileName = "编程导航原创项目.pdf";
            String content = "编程导航原创项目 https://www.codefather.cn";
            String result = tool.generatePDF(fileName, content);
            assertNotNull(result);
        }

}