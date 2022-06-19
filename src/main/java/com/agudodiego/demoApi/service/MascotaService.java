package com.agudodiego.demoApi.service;

import com.agudodiego.demoApi.model.Mascota;
import com.agudodiego.demoApi.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    public MascotaRepository mascotaRepository;

    @Override
    public List<Mascota> mostrarMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public void crearMascota(Mascota masc) {
        mascotaRepository.save(masc);
    }

    @Override
    public void borrarMascota(Integer id) {
        mascotaRepository.deleteById(id);
    }

    //Cuando se busca un registro por id, podría suceder que no lo encuentre
    //para solucionar esto se agrega el .orElse(null) que devolvera un null en ese caso
    @Override
    public Mascota buscarMascota(Integer id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarMascota(Mascota masc) {
        mascotaRepository.save(masc);
    }
}
