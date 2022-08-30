package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Enterprise;
import developers3x2.proyecto.entidad.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(int id);
    public List<Usuario> findAll();
    public Usuario createUsuario(Usuario usuario);
    public Usuario updateUsuario(int id, Usuario usuario);
    public void deleteUsuario(int id);

}
