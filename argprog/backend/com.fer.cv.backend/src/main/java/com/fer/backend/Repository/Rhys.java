/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.Repository;

import com.fer.backend.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Fer
 */
public interface Rhys extends JpaRepository<Skills, Integer> {

    Optional<Skills> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
