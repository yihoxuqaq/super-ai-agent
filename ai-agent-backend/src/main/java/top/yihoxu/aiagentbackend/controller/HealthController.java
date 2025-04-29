package top.yihoxu.aiagentbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List list=new ArrayList();
        return "ok";
    }
}
