/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.Service;

import com.fer.backend.Entity.Persona;
import com.fer.backend.Interface.IPersonaService;
import com.fer.backend.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fer
 */
@Service
public class ImpPersonaService implements IPersonaService{
    
    @Autowired
    IPersonaRepository ipersonarepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona=ipersonarepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona =ipersonarepository.findById(id).orElse(null);
       return persona;
    }
    
}
