
package com.portolio.dan.Security.Repository;

import com.portolio.dan.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByRolNombre(String nombreUsuario); 
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
