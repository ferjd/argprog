/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fer.backend.DTO;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Fer
 */
public class EducacionDto {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public EducacionDto() {
    }

    public EducacionDto(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
