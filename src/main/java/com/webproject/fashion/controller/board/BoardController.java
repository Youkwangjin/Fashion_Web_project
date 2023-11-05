package com.webproject.fashion.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/list")
    public String boardList() {
        return "board/board-list";
    }

    @GetMapping("/write")
    public String boardWrite() {
        return "board/board-write";
    }
}
