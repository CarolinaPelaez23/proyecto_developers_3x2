package developers3x2.proyecto.controller;

import developers3x2.proyecto.entidad.Usuario;
import developers3x2.proyecto.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    IUsuarioService usuarioService;

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable int id) {
        return usuarioService.findById(id);
    }

    @GetMapping("/usuario")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @PostMapping("/usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/usuario/{id}")
    public Usuario updateUsuario(@PathVariable int id,@RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void deleteUsuario(@PathVariable int id) {
       usuarioService.deleteUsuario(id);

    }
}
