package com.example.rediswebflux;

import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@RequestMapping("/")
@Controller
public class HomeController {
    private ReactiveRedisOperations<String, String> template;

    public HomeController(ReactiveRedisOperations<String, String> template) {
        this.template = template;
    }

    @GetMapping("")
    @ResponseBody
    public Mono<String> index() {
        return template.opsForValue().get("key");
    }
}
