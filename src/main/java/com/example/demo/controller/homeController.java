package com.example.demo.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/") // / << 이건 홈 . 홈에가면 작성해논 게시물을 쫙 보여주도록 할 예정
    public String home(){
        return "index"; //게시물작성
    }


    @GetMapping("/login")
    public String login(Model model) {
        return "login"; // "join.html" 파일을 렌더링
    }
    @GetMapping("/join")
    public String join(Model model){
        return "join";
    }
}
