package com.gn0ng.repository;

import com.gn0ng.entity.PlayableCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PlayableCharacterRepository  extends JpaRepository<PlayableCharacter, Long>, QuerydslPredicateExecutor<PlayableCharacter> {


    PlayableCharacter findByIdIs(Long ch);
}
