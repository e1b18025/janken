package oit.is.z1362.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {


  @PostMapping("/lec02")
  public String lec02(@RequestParam String name,ModelMap model) {
    model.addAttribute("name",name);
    return "lec02.html";
  }

@GetMapping("/lec02")
  public String lec02janken(@RequestParam Integer hand, ModelMap model) {
    String my;
    String COM="相手の手 Gu";
    String syouhai;
    if(hand == 0){
      my="あなたの手 Gu";
      syouhai="aiko";
      model.addAttribute("my",my);
      model.addAttribute("COM",COM);
      model.addAttribute("syouhai",syouhai);
    }
    if(hand == 1){
      my="あなたの手 Choki";
      syouhai="You Lose!";
      model.addAttribute("my",my);
      model.addAttribute("COM",COM);
      model.addAttribute("syouhai",syouhai);
    }
    if(hand == 2){
      my="あなたの手 Pa";
      syouhai="You Win!";
      model.addAttribute("my",my);
      model.addAttribute("COM",COM);
      model.addAttribute("syouhai",syouhai);
    }
    return "lec02.html";
  }
}
