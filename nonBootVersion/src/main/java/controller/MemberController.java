package controller;

import domain.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping("/members")
    public String members(Model model) {
        model.addAttribute("members", memberRepository.findAll());
        return "members";
    }
}
