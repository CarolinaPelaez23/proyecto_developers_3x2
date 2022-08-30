package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Enterprise;
import developers3x2.proyecto.entidad.RoleName;
import developers3x2.proyecto.entidad.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{


    @Override
    public Usuario findById(int id) {
        Enterprise empresa = new Enterprise(1, "Adidas", "232352", "34555533", "crr 45 45 45", true);
        RoleName rol = RoleName.Admin;
        Usuario usuario = new Usuario(1, "jsoijf@kjlas.com", rol, empresa, true);
        return usuario;
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Enterprise empresa = new Enterprise(1, "Adidas", "232352", "34555533", "crr 45 45 45", true);
        RoleName rol = RoleName.Admin;
        Usuario usuario = new Usuario(1, "jsoijf@kjlas.com", rol, empresa, true);

        Enterprise empresa2 = new Enterprise(1, "Adidas", "232352", "34555533", "crr 45 45 45", true);
        RoleName rol2 = RoleName.Admin;
        Usuario usuario2 = new Usuario(1, "jsoijf@kjlas.com", rol2, empresa2, true);

        usuarios.add(usuario);
        usuarios.add(usuario2);
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
