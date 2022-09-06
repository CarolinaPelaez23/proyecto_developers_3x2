package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Transaction;

import java.util.List;

public interface ITransactionService {

    public Transaction findById(int id);

    public List<Transaction> findAll();

    public Transaction createTransaction(Transaction transaction);

    public Transaction updateTransaction( int id,Transaction transaction);

    public void deleteTransaction(int id);
}
