package developers3x2.proyecto.service;


import developers3x2.proyecto.entidad.Profile;
import developers3x2.proyecto.entidad.Transaction;
import developers3x2.proyecto.repositories.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService {
    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction findById(int id_enterprise, int id) {
        Optional<Transaction> trasaccion = transactionRepository.findById((long) id);

        return trasaccion.get();
    }
    @Override
    public List<Transaction> findAll(int id_enterprise) {
        List<Transaction> newTransacciones = new ArrayList<Transaction>();
        List<Transaction> transacciones = (List<Transaction>) transactionRepository.findAll();
        for (Transaction movimiento : transacciones) {
            if (movimiento.getUsuario().getEnterprise().getId() == id_enterprise) {
                newTransacciones.add(movimiento);
            }
        }
        return newTransacciones;

    }
    @Override

    public Transaction createTransaction(int id_enterprise, Transaction transaction) {
        transaction.setCreatedAt(new Date());
        return transactionRepository.save(transaction);
    }
    @Override

    public Transaction updateTransaction(int id_enterprise, int id, Transaction transaction) {
        transaction.setCreatedAt(new Date());
        transaction.setId(id);
        return transactionRepository.save(transaction);
    }
    @Override

    public void deleteTransaction(int id_enterprise, int id) {
        transactionRepository.deleteById((long) id);

    }
}
