package developers3x2.proyecto.repositories;

import developers3x2.proyecto.entidad.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface ITransactionRepository extends CrudRepository<Transaction, Long> {
}
