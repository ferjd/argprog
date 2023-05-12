/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.Service;

import com.fer.backend.Entity.Educacion;
import com.fer.backend.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fer
 */
@Service
@Transactional
public class EducacionService {
    @Autowired
    IEducacionRepository ieducacionRepository;
    
    public List<Educacion> list(){
        return ieducacionRepository.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return ieducacionRepository.findById(id);
    }
    
    public Optional<Educacion> getByTituloEd(String tituloEd){
        return ieducacionRepository.findByTituloEd(tituloEd);
    }
    
    public void save(Educacion educacion){
        ieducacionRepository.save(educacion);
    }
    
    public void delete(int id){
        ieducacionRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return ieducacionRepository.existsById(id);
    }
    
    public boolean existsByTituloEd(String tituloEd){
        return ieducacionRepository.existsByTituloEd(tituloEd);
    }
}
