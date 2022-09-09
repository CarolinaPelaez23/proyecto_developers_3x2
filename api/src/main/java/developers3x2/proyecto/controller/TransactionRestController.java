package developers3x2.proyecto.controller;


import developers3x2.proyecto.entidad.Enterprise;
import developers3x2.proyecto.entidad.Transaction;
import developers3x2.proyecto.service.IEnterpriseService;
import developers3x2.proyecto.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
@RestController// si le pongo rest estoy creando una API
@RequestMapping("/api")


public class TransactionRestController {
@Autowired
private ITransactionService transactionService;

    @GetMapping("/enterprises/{id_enterprise}/movements/{id}")
    public Transaction findById(@PathVariable int id_enterprise, @PathVariable int id){
        return transactionService.findById(id_enterprise, id);
    }

    // Buscar todos

    @GetMapping("/enterprises/{id_enterprise}/movements")
   public List<Transaction> findAll(@PathVariable int id_enterprise){
        return transactionService.findAll(id_enterprise);
    }

    //POST CREACION DE ELEMENTO
    @PostMapping("/enterprises/{id_enterprise}/movements")
    public Transaction createTransaction(@PathVariable int id_enterprise, @RequestBody Transaction transaction){

        return transactionService.createTransaction(id_enterprise, transaction);
    }

    //Actualizar informacion

    @PutMapping("/enterprises/{id_enterprise}/movements/{id}")
    public Transaction updateTransaction(@PathVariable int id_enterprise, @PathVariable int id, @RequestBody Transaction transaction){
        // captura lo enviado por el postman y lo guarda en el objeto
        return transactionService.updateTransaction(id_enterprise, id, transaction);

    }

    @DeleteMapping("/enterprises/{id_enterprise}/movements/{id}")
    public void deleteTransaction(@PathVariable int id_enterprise, @PathVariable int id){
        // captura lo enviado por el postman y lo guarda en el objeto
        transactionService.deleteTransaction(id_enterprise, id);
    }


}
