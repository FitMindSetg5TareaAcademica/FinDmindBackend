package Grupo05.FitMindSet.Controller;


import Grupo05.FitMindSet.domain.Entity.Usuario;
import Grupo05.FitMindSet.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario nuevoUsuario = usuarioService.registrarUsuario(usuario);
            return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
    }
    @PostMapping("/iniciar-sesion")
    public ResponseEntity<Usuario> iniciarSesion(@RequestBody Usuario usuario) {
        try {
            Usuario usuarioAutenticado = usuarioService.iniciarSesion(usuario.getCorreo(), usuario.getContrasena());
            return new ResponseEntity<>(usuarioAutenticado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }
    }
}
