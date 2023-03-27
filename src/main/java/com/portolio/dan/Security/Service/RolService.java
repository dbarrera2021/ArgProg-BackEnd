
package com.portolio.dan.Security.Service;

import com.portolio.dan.Security.Entity.Rol;
import com.portolio.dan.Security.Enums.RolNombre;
import com.portolio.dan.Security.Repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//si falla que se mantenga en estado anterior
public class RolService {
    @Autowired
    IRolRepository irolrepository;
    
    public Optional<Rol> getByRolNombre(RolNombre Rolnombre){
        return irolrepository.findByRolNombre(Rolnombre);
    }
    
    
    public void save (Rol rol ){
        irolrepository.save(rol);
    }
}
