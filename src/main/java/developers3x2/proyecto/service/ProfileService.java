package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.Profile;
import developers3x2.proyecto.repositories.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements IProfileService {
    @Autowired
    private IProfileRepository profileRepository;

    @Override
    public Profile findById(int id) {
        Optional<Profile> perfil = profileRepository.findById((long) id);
        return perfil.get();
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> perfiles = (List<Profile>) profileRepository.findAll();
        return perfiles;
    }

    @Override
    public Profile createProfile(Profile perfil) {
        perfil.setCreatedAt(new Date());
        return profileRepository.save(perfil);
    }

    @Override
    public Profile updateProfile(Profile perfil) {
        System.out.println("editando perfil");
        return profileRepository.save(perfil);
    }

    @Override
    public void deleteProfile(int id) {
        profileRepository.deleteById((long) id);
    }
}
