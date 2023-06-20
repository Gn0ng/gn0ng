package com.gn0ng.entity;

import com.gn0ng.dto.PlayableCharacterDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "pCharacter")
public class PlayableCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String img;

    private double speed;

    private double att;

    private double heart;

    public static PlayableCharacter createCharacter(PlayableCharacterDto playableCharacterDto){
        PlayableCharacter playableCharacter = new PlayableCharacter();
        playableCharacter.setImg(playableCharacterDto.getImg());
        playableCharacter.setSpeed(playableCharacterDto.getSpeed());
        playableCharacter.setAtt(playableCharacterDto.getAtt());
        playableCharacter.setHeart(playableCharacterDto.getHeart());
        return playableCharacter;
    }

}
