/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.Service;

import com.fer.backend.Entity.Proyecto;
import com.fer.backend.Repository.IProyectoRepository;
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
public class ProyectoService {

    @Autowired
    IProyectoRepository iproyectoRepository;

    public List<Proyecto> list() {
        return iproyectoRepository.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return iproyectoRepository.findById(id);
    }

    public Optional<Proyecto> getByNombreP(String nombreP) {
        return iproyectoRepository.findByNombreP(nombreP);
    }

    public void save(Proyecto proyecto) {
        iproyectoRepository.save(proyecto);
    }

    public void delete(int id) {
        iproyectoRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return iproyectoRepository.existsById(id);
    }

    public boolean existsByNombreP(String nombreP) {
        return iproyectoRepository.existsByNombreP(nombreP);
    }
}
