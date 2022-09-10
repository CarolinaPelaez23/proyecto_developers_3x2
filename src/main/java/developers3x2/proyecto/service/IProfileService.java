package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Profile;

import java.util.List;

public interface IProfileService {
    public Profile findById(int id);

    public List<Profile> findAll();
    public Profile createProfile(Profile perfil);
    public Profile updateProfile(Profile perfil);
    public void deleteProfile(int id);
}
