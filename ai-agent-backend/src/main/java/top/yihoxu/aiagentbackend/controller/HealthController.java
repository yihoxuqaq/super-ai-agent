package top.yihoxu.aiagentbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yihoxu
 * @date 2025/4/28  13:31
 * @description 健康检查接口
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/ok")
    public String health() {
        return "ok";
    }
}
