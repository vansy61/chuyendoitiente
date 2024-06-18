package com.example.chuyendoitiente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyenDoiTienTe {
    @RequestMapping("/form")
    public String showForm() {
        return "/form";
    }

    @RequestMapping("/chuyen")
    public String chuyenDoi(@RequestParam double amount, Model model) {
        model.addAttribute("amount", amount);
        model.addAttribute("result", amount * 23000);
        return "/result";
    }
}
