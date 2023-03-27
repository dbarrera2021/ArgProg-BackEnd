
package com.portolio.dan.Controler;

import com.portolio.dan.Entity.Persona;
import com.portolio.dan.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PersonaController {
    @Autowired IPersonaService ipersonaservice;
    
    @GetMapping("/personas/Traer")
    public List<Persona> getPersona(){
        return ipersonaservice.getPersona();    
    }
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping("/personas/borrar/{id}")
        public String deletePersona(@PathVariable Long id){
            ipersonaservice.deletePersona(id);
            return  "La persona fue eliminada correctamente";
        }
        
        //editar persona 
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable long id,
                                @RequestParam("nombre")String NuevoNombre,
                                @RequestParam("apellido")String NuevoApellido,
                                @RequestParam("imgPerfil")String NuevoImgPerfil){
    
        //primero buscar a la persona que queremos modificar
        //y la guardamos en la variable persona  
        
        
        Persona persona= ipersonaservice.findPersona(id);
        
        persona.setNombre(NuevoNombre);
        persona.setApellido(NuevoApellido);
        persona.setImgPerfil(NuevoImgPerfil);
        
        ipersonaservice.savePersona(persona);
        return persona;
        }  
        
        @GetMapping("/personas/traer/perfil")
        public Persona findPersona(){
            return ipersonaservice.findPersona((long)1);
        }
    }


    
    
    
    
    

