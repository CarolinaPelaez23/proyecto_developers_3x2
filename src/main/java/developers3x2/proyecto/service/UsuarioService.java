package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.RoleName;
import developers3x2.proyecto.entidad.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{


    @Override
    public Usuario findById(int id) {
        Usuario newUsuario = new Usuario(1, "mail@usuairo.com", RoleName.Admin, null, true);
        return newUsuario;
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario newUsuario1 = new Usuario(1, "mail@usuairo.com", RoleName.Admin, null, true);
        Usuario newUsuario2 = new Usuario(1, "mail@usuairo.com", RoleName.Admin, null, true);
        usuarios.add(newUsuario1);
        usuarios.add(newUsuario2);
        return usuarios;
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
