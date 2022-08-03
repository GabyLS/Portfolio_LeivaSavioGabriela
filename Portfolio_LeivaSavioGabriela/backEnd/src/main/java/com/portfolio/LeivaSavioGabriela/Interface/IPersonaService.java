/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.LeivaSavioGabriela.Interface;

import com.portfolio.LeivaSavioGabriela.Entity.Persona;
import java.util.List;

/**
 *
 * @author Gabriela
 */
public interface IPersonaService {
    //Traer lista de persona
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario(objeto) 
    public void deletePersona(Long id);
    
    //Buscar persona por Id
    public Persona findPersona(Long id);
    
}
