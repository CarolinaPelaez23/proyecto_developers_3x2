package developers3x2.proyecto.service;


import developers3x2.proyecto.entidad.Enterprise;
import developers3x2.proyecto.entidad.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class TransactionService implements ITransactionService {
    @Autowired
    private IEnterpriseService enterpriseService;

    @Override
    public Transaction findById(int id_enterprise, int id) {
        Enterprise empresa = enterpriseService.findById(id_enterprise);
        List<Transaction> movimientos = empresa.getTransactions();
        for (Transaction movimiento : movimientos) {
            if (movimiento.getId() == id) {
                return movimiento;
            }
        }
        return null;
    }
    @Override
    public List<Transaction> findAll(int id_enterprise) {
        Enterprise empresa = enterpriseService.findById(id_enterprise);
        return empresa.getTransactions();
    }
    @Override

    public Transaction createTransaction(int id_enterprise, Transaction transaction) {
        Transaction newTransaction = transaction;
        newTransaction.setId(5);
        newTransaction.setCreatedAt(new Date());

        Enterprise empresa = enterpriseService.findById(id_enterprise);
        List<Transaction> movimientos = empresa.getTransactions();

        movimientos.add(transaction);
        empresa.setTransactions((ArrayList<Transaction>) movimientos);
        enterpriseService.updateEnterprise(id_enterprise, empresa);
        return newTransaction;
    }
    @Override

    public Transaction updateTransaction(int id_enterprise, int id, Transaction transaction) {
        Transaction putTransaction = findById(id_enterprise, id);
        putTransaction.setAmount(transaction.getAmount());
        putTransaction.setConcept(transaction.getConcept());
        putTransaction.setEstado(transaction.isEstado());

        Enterprise empresa = enterpriseService.findById(id_enterprise);
        List<Transaction> movimientos = empresa.getTransactions();

        movimientos.add(putTransaction);
        empresa.setTransactions((ArrayList<Transaction>) movimientos);
        enterpriseService.updateEnterprise(id_enterprise, empresa);
        return putTransaction;
    }
    @Override

    public void deleteTransaction(int id_enterprise, int id) {
        Transaction deleteTransaction = findById(id_enterprise, id);

    }
}
