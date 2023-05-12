/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.Controller;

import com.fer.backend.DTO.PersonaDto;
import com.fer.backend.Entity.Persona;
import com.fer.backend.Security.Controller.Mensaje;
import com.fer.backend.Service.PersonaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fer
 */
@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id){
        if(!personaService.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        
        Persona persona = personaService.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody PersonaDto personaDto){
        if(!personaService.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        if(personaService.existsByNombre(personaDto.getNombre()) && personaService.getByNombre(personaDto.getNombre()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Esa persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(personaDto.getNombre())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        
        Persona persona = personaService.getOne(id).get();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        persona.setImg(personaDto.getImg());
        
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!personaService.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        
        personaService.delete(id);
        
        return new ResponseEntity(new Mensaje("Persona eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PersonaDto personaDto){
        if(StringUtils.isBlank(personaDto.getNombre())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(personaService.existsByNombre(personaDto.getNombre())){
            return new ResponseEntity(new Mensaje("Esa persona existe"), HttpStatus.BAD_REQUEST);
        }
        
        Persona persona = new Persona(personaDto.getNombre(), personaDto.getApellido(), personaDto.getImg());
        personaService.save(persona);
        
        return new ResponseEntity(new Mensaje("Persona agregada"), HttpStatus.OK);
    }
}
