package developers3x2.proyecto.controller;

import developers3x2.proyecto.entidad.Enterprise;
import developers3x2.proyecto.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EnterpriseRestController {

    @Autowired

    private IEnterpriseService enterpriseService;

    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable int id){
        return enterpriseService.findById(id);
    }

    @GetMapping("/enterprise")
    public List<Enterprise> findAll(){
        return enterpriseService.findAll();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return enterpriseService.createEnterprise(enterprise);
    }

    @PutMapping("/enterprise/{id}")
    public Enterprise updateEnterprise(@PathVariable int id, @RequestBody Enterprise enterprise) {
        return enterpriseService.updateEnterprise(id, enterprise);
    }

    @DeleteMapping("/enterprise/{id}")
    public void deleteEnterprise(@PathVariable int id){
        enterpriseService.deleteEnterprise(id);
        //Buscando y borrando
    }





}
