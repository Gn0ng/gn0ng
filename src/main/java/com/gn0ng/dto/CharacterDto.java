package com.gn0ng.dto;


import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CharacterDto {

    private Long id;

    private String img;

    private double speed;

    private double att;

    private double heart;

    private static ModelMapper modelMapper = new ModelMapper();

    public Character createCharacter(){
        return modelMapper.map(this, Character.class);
    }
    public static CharacterDto of(Character character) {
        return modelMapper.map(character, CharacterDto.class);

    }
}
