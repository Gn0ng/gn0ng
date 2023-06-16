package com.gn0ng.entity;

import com.gn0ng.dto.CharacterDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "pCharacter")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String img;

    private double speed;

    private double att;

    private double heart;

    public static Character createCharacter(CharacterDto characterDto){
        Character character = new Character();
        character.setImg(characterDto.getImg());
        character.setSpeed(characterDto.getSpeed());
        character.setAtt(characterDto.getAtt());
        character.setHeart(characterDto.getHeart());
        return character;
    }

}
