package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Enterprise;

import java.util.List;

public interface IEnterpriseService {
    public Enterprise findById(int id);

    public List<Enterprise> findAll();
    public Enterprise createEnterprise(Enterprise empresa);
    public Enterprise updateEnterprise(int id, Enterprise empresa);
    public void deleteEnterprise(int id);
}
