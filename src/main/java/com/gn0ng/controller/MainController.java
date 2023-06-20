package com.gn0ng.controller;

import com.gn0ng.entity.PlayableCharacter;
import com.gn0ng.repository.PlayableCharacterRepository;
import com.gn0ng.service.PlayableCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PlayableCharacterRepository playableCharacterRepository;

    @GetMapping("/")
    public String main(Model model) {

        List<PlayableCharacter> characterList = playableCharacterRepository.findAll();

        model.addAttribute("characters", characterList);


        return "main0";
    }

    @GetMapping("/game/{ch}")
    public String main2(Model model, @PathVariable(required = false) Long ch){

        PlayableCharacter playableCharacter = playableCharacterRepository.findByIdIs(ch);
        model.addAttribute("ch",playableCharacter);
        model.addAttribute("speed",playableCharacter.getSpeed());
        model.addAttribute("img", playableCharacter.getImg());
        model.addAttribute("att",playableCharacter.getAtt());
        model.addAttribute("heart",playableCharacter.getHeart());

        return "main";
    }
}
