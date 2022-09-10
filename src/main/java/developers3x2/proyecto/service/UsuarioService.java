package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Profile;
import developers3x2.proyecto.entidad.Usuario;
import developers3x2.proyecto.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Autowired
    private ProfileService profileService;

    @Override
    public Usuario findById(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById((long) id);
        return usuario.get();
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();

        return usuarios;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Profile perfil = profileService.createProfile(usuario.getProfile());
        usuario.setProfile(perfil);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(int id, Usuario usuario) {
        Profile newPerfil = profileService.updateProfile( usuario.getProfile());
        usuario.setProfile(newPerfil);
        usuario.setIdUser(id);
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(int id) {
        usuarioRepository.deleteById((long) id);

    }
}
