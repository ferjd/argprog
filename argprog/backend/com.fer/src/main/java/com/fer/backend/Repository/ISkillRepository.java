/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.Repository;

import com.fer.backend.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fer
 */
@Repository
public interface ISkillRepository extends JpaRepository<Skill, Integer>{
    Optional<Skill> findByNombreSk(String nombreSk);
    public boolean existsByNombreSk(String nombreSk);
}
