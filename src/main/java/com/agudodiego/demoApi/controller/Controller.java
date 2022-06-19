package com.agudodiego.demoApi.controller;

import com.agudodiego.demoApi.model.Mascota;
import com.agudodiego.demoApi.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Mediante la annotation @RestController le indicamos a SB que esta clase es la clase controladora a
//dnd tiene que redirigir todas las peticiones.
@RestController
public class Controller {

    @Autowired
    private IMascotaService mascotaService;

    @PostMapping ("/new/mascota")
    public void agregarMascota(@RequestBody Mascota mascotaNueva){
        mascotaService.crearMascota(mascotaNueva);
    }

    //Si la lista vuelve VACIA no pasa nada porque devuelve un JSON vacio
    @GetMapping ("/ver/mascotas")
    @ResponseBody
    public List<Mascota> verMascotas(){
        return mascotaService.mostrarMascotas();
    }

    @DeleteMapping ("/borrar/{id}")
    public void borrarMascota(@PathVariable Integer id){
        mascotaService.borrarMascota(id);
    }

    @PutMapping ("/modificar/mascota")
    public void modificarMascota(@RequestBody Mascota mascotaModificar) {
        mascotaService.modificarMascota(mascotaModificar);
    }

}
