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
public class SkillDto {
    @NotBlank
    private String nombreSk;
    @NotBlank
    private int porcentaje;

    public SkillDto() {
    }

    public SkillDto(String nombreSk, int porcentaje) {
        this.nombreSk = nombreSk;
        this.porcentaje = porcentaje;
    }

    public String getNombreSk() {
        return nombreSk;
    }

    public void setNombreSk(String nombreSk) {
        this.nombreSk = nombreSk;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }    
}
