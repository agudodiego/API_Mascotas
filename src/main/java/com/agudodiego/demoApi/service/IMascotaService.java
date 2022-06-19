package com.agudodiego.demoApi.service;

import com.agudodiego.demoApi.model.Mascota;
import java.util.List;

public interface IMascotaService {
    public List<Mascota> mostrarMascotas();
    public void crearMascota(Mascota masc);
    public void borrarMascota(Integer id);
    public Mascota buscarMascota(Integer id);
    public void modificarMascota(Mascota masc);
}
