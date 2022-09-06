package developers3x2.proyecto.controller;


import developers3x2.proyecto.entidad.Transaction;
import developers3x2.proyecto.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController// si le pongo rest estoy creando una API
@RequestMapping("/api")


public class TransactionRestController {
@Autowired
private ITransactionService transactionService;

    @GetMapping("/enterprises/{id}/movements")
    public Transaction findById(@PathVariable int id){
        return transactionService.findById(id);
    }

    // Buscar todos

    @GetMapping("/enterprises/{id}/movements")
    public List<Transaction> findAll(){return transactionService.findAll();}

    //POST CREACION DE ELEMENTO
    @PostMapping("/enterprises/{id}/movements")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);}

    //Actualizar informacion

    @PutMapping("/enterprises/{id}/movements")
    public Transaction updateTransaction(@PathVariable int id,@RequestBody Transaction transaction){ // captura lo enviado por el postman y lo guarda en el objeto
        return transactionService.updateTransaction(id, transaction);

    }
    @DeleteMapping("/enterprises/{id}/movements")
    public void deleteTransaction(@PathVariable int id){ // captura lo enviado por el postman y lo guarda en el objeto
        transactionService.deleteTransaction(id);
    }


}
