package com.cpan252.tekkenreborn.repository;

import java.util.Optional;

import com.cpan252.tekkenreborn.model.Fighter;


//It will be an interface that defines operations with the fighter
//table in the database
public class FighterRepository {
    Iterable<Fighter> findAll();

    Optional<Fighter> findById(Long id);

    void save(Fighter fighter);
}
