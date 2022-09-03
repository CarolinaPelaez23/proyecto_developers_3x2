package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EnterpriseService implements IEnterpiseService {
    @Override
    public Enterprise findById(int id) {

        Enterprise empresa = new Enterprise();
        empresa.setId(1);
        empresa.setName("Bancolombia");
        empresa.setDocument("34.234.345");
        empresa.setPhone("6947849");
        empresa.setAddress("Cl 15 5 21");
        empresa.setCreatedAt(new Date());
        empresa.setEstado(true);
        return empresa;
    }

    @Override
    public List<Enterprise> findAll() {

        List<Enterprise> enterprises = new ArrayList<>();

        Enterprise empresa1 = new Enterprise();
        empresa1.setId(1);
        empresa1.setName("Bancolombia");
        empresa1.setDocument("34.234.345");
        empresa1.setPhone("6947849");
        empresa1.setAddress("Cl 15 5 21");
        empresa1.setCreatedAt(new Date());
        empresa1.setEstado(true);
        enterprises.add(empresa1);

        Enterprise empresa2 = new Enterprise();
        empresa2.setId(2);
        empresa2.setName("Colpatria");
        empresa2.setDocument("900.090.325");
        empresa2.setPhone("415618");
        empresa2.setAddress("Cl 22 110 12");
        empresa2.setCreatedAt(new Date());
        empresa2.setEstado(true);
        enterprises.add(empresa2);

        return enterprises;
    }

    @Override
    public Enterprise createEnterprise(Enterprise empresa) {
        Enterprise newEmpresa = new Enterprise();
        newEmpresa.setId(empresa.getId());
        newEmpresa.setName(empresa.getName());
        newEmpresa.setDocument(empresa.getDocument());
        newEmpresa.setPhone(empresa.getPhone());
        newEmpresa.setAddress(empresa.getAddress());
        newEmpresa.setCreatedAt(new Date());
        newEmpresa.setEstado(empresa.isEstado());
        return newEmpresa;
    }


    @Override
    public Enterprise updateEnterprise(int id, Enterprise empresa) {
        Enterprise newEmpresa = findById(id);

        newEmpresa.setId(empresa.getId());
        newEmpresa.setName(empresa.getName());
        newEmpresa.setDocument(empresa.getDocument());
        newEmpresa.setPhone(empresa.getPhone());
        newEmpresa.setAddress(empresa.getAddress());
        newEmpresa.setUpdatedAt(new Date());
        newEmpresa.setEstado(empresa.isEstado());
        return newEmpresa;
    }

    @Override
    public void deleteEnterprise(int id) {
        Enterprise empresa1 = findById(id);
    }


    /*
    @Override
    public List<Enterprise> findAll() {
        List<Enterprise> empresas = new ArrayList<Enterprise>();

        Enterprise empresa1 = new Enterprise(2, "Bancolombia", "34.234.345", "312 344 2345", "cqaler 123", true);
        Usuario usuario1 = new Usuario(1, "admin@banclombia.com", RoleName.Admin, empresa1, true);
        Transaction movimiento1 = new Transaction(12, "compra de equipos", 32434.4, usuario1, empresa1, true);

        empresa1.addUsers(usuario1);
        empresa1.addTransaction(movimiento1);

        Enterprise empresa2 = new Enterprise(2, "Bancolombia", "34.234.345", "312 344 2345", "cqaler 123", true);
        Usuario usuario2 = new Usuario(1, "admin@banclombia.com", RoleName.Admin, empresa2, true);
        Transaction movimiento2 = new Transaction(12, "compra de equipos", 32434.4, usuario2, empresa2, true);

        empresa2.addUsers(usuario2);
        empresa2.addTransaction(movimiento2);

        empresas.add(empresa1);
        empresas.add(empresa2);
        return empresas;
    }

    @Override
    public Enterprise createEnterprise(Enterprise empresa) {
        Enterprise empresa1 = new Enterprise(empresa.getId(), empresa.getName(), empresa.getDocument(), empresa.getPhone(), empresa.getAddress(), empresa.isEstado());
        Usuario usuario1 = new Usuario(1, "admin@banclombia.com", RoleName.Admin, empresa1, true);
        Transaction movimiento1 = new Transaction(12, "compra de equipos", 32434.4, usuario1, empresa1, true);

        empresa1.addUsers(usuario1);
        empresa1.addTransaction(movimiento1);
        return empresa1;
    }

    @Override
    public Enterprise updateEnterprise(int id, Enterprise empresa) {
        Enterprise empresa1 = findById(id);
        empresa1.setName(empresa.getName());
        empresa1.setDocument(empresa.getDocument());
        empresa1.setPhone(empresa.getPhone());
        empresa1.setAddress(empresa.getAddress());
        empresa1.setEstado(empresa.isEstado());
        empresa1.setUsers(empresa.getUsers());
        empresa1.setTransactions(empresa.getTransactions());

        return empresa1;
    }

    @Override
    public void deleteEnterprise(int id) {
        Enterprise empresa1 = findById(id);
    }*/
}
