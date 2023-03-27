package com.portolio.dan.Interface;

import com.portolio.dan.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas 
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario u objeto lo buscamos por id
    public void  deletePersona(Long id);
    
    //Buscar una persona  por id 
    public Persona findPersona(Long id);
    
}
