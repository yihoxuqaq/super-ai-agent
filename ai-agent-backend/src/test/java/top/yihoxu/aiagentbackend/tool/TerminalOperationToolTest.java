package top.yihoxu.aiagentbackend.tool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yihoxu
 * @date 2025/5/13  14:26
 * @description todo
 */
class TerminalOperationToolTest {

    @Test
    void executeTerminalCommand() {
        TerminalOperationTool terminalOperationTool = new TerminalOperationTool();
        String s = terminalOperationTool.executeTerminalCommand("pwd");
        Assertions.assertNotNull(s);
    }
}