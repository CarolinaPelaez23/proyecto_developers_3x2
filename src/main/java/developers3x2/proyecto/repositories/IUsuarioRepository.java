package developers3x2.proyecto.repositories;

import developers3x2.proyecto.entidad.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
