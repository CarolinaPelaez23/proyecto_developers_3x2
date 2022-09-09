package developers3x2.proyecto.repositories;

import developers3x2.proyecto.entidad.Profile;
import org.springframework.data.repository.CrudRepository;

public interface IProfileRepository extends CrudRepository<Profile, Long> {
}
