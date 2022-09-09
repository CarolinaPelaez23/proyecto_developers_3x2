package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Transaction;

import java.util.List;

public interface ITransactionService {

    public Transaction findById(int id_enterprise, int id);

    public List<Transaction> findAll(int id_enterprise);

    public Transaction createTransaction(int id_enterprise, Transaction transaction);

    public Transaction updateTransaction(int id_enterprise, int id,Transaction transaction);

    public void deleteTransaction(int id_enterprise, int id);
}
