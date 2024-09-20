
package Grupo05.FitMindSet.Service;

import Grupo05.FitMindSet.domain.Entity.Usuario;
import Grupo05.FitMindSet.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        if (usuarioRepository.findByCorreo(usuario.getCorreo()) != null) {
            throw new RuntimeException("El correo ya está registrado.");
        }
        return usuarioRepository.save(usuario);
    }
}
