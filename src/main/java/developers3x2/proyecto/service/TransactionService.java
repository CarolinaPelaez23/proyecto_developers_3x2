package developers3x2.proyecto.service;


import developers3x2.proyecto.entidad.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TransactionService implements ITransactionService {

    @Override
    public Transaction findById(int id) {
        Transaction transaction = new Transaction(1,"pago nomina", 1234.7, true);
        return transaction;
    }
    @Override

    public List<Transaction> findAll() {
        List<Transaction> transacciones = new ArrayList<Transaction>(); //Estructura de datos dinamica, no debo decirle el tamaño

        Transaction transaction1 =new Transaction(1,"pruebas",1234.50,true);
        transacciones.add(transaction1);

        Transaction transaction2 =new Transaction(2,"pruebas",1234.50,true);
        transacciones.add(transaction2);


        return transacciones;

    }
    @Override

    public Transaction createTransaction(Transaction transaction) {
        Transaction newTransaction =new Transaction(2, transaction.getConcept(), transaction.getAmount(), transaction.isEstado());

        return newTransaction;// Devuelve este objeto
    }
    @Override

    public Transaction updateTransaction(int id, Transaction transaction) {
        Transaction putTransaction = findById(id);
        putTransaction.setId(transaction.getId());
        putTransaction.setAmount(transaction.getAmount());
        putTransaction.setConcept(transaction.getConcept());
        putTransaction.setEstado(transaction.isEstado());

        return putTransaction;// Devuelve este objeto
    }
    @Override

    public void deleteTransaction(int id) {
        Transaction deleteTransaction = findById(id);

    }
}
