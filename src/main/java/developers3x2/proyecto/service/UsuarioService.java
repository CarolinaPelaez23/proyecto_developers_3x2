package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{


    @Override
    public Usuario findById(int id) {
        return null;
    }

    @Override
    public List<Usuario> findAll() {

        return null;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario newUsuario = new Usuario(1, usuario.getEmail(), usuario.getRole(), usuario.getEnterprise(), usuario.isEstado());
        return newUsuario;
    }

    @Override
    public Usuario updateUsuario(int id, Usuario usuario) {
        Usuario newUsuario = findById(id);
        newUsuario.setEmail(usuario.getEmail());
        newUsuario.setRole(usuario.getRole());
        newUsuario.setEnterprise(usuario.getEnterprise());
        newUsuario.setEstado(usuario.isEstado());
        return newUsuario;
    }

    @Override
    public void deleteUsuario(int id) {
        Usuario usuario = findById(id);

    }
}
