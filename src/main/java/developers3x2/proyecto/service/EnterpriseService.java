package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService implements IEnterpiseService {
    @Override
    public Enterprise findById(int id) {
        Enterprise empresa = new Enterprise(2, "Bancolombia", "34.234.345", "312 344 2345", "cqaler 123", true);
        Usuario usuario = new Usuario(1, "admin@banclombia.com", RoleName.Admin, empresa, true);
        Profile perfil = new Profile("1", "fdsf.jpg","324342342", usuario, true);
        Transaction movimiento = new Transaction(12, "compra de equipos", 32434.4, usuario, empresa, true);

        empresa.addUsers(usuario);
        empresa.addTransaction(movimiento);

        return empresa;
    }

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
        Usuario usuario1 = empresa.getUsers();
        Transaction movimiento1 = new Transaction(12, "compra de equipos", 32434.4, usuario1, empresa1, true);

        empresa1.addUsers(usuario1);
        empresa1.addTransaction(movimiento1);
        return null;
    }

    @Override
    public Enterprise updateEnterprise(int id, Enterprise empresa) {
        return null;
    }

    @Override
    public void deleteEnterprise(int id) {

    }
}
