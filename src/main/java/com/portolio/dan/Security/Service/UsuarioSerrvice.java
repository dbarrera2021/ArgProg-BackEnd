package com.portolio.dan.Security.Service;

import com.portolio.dan.Security.Entity.Usuario;
import com.portolio.dan.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioSerrvice {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    //chequee si el usuario existe
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    //cheque si el mail existe
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    //guarda un usuario nuevo 
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
