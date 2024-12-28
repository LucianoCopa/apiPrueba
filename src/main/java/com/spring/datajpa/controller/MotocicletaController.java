package com.spring.datajpa.controller;

import com.spring.datajpa.entity.Motocicleta;
import com.spring.datajpa.service.MotocicletaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api")
@RestController
public class MotocicletaController {

    @Autowired
    private MotocicletaService motocicletaService;


    @PostMapping
    public Motocicleta saveMotocicleta(@RequestBody Motocicleta motocletaToSave) {
          return motocicletaService.saveMotocicleta(motocletaToSave);
    }


    @PutMapping
    public Motocicleta updateMotocicleta(@RequestBody Motocicleta motocletaToUpdate) {
        return motocicletaService.updateMotocicleta(motocletaToUpdate);
    }

    @GetMapping
    public Motocicleta findMotocicleta(@RequestParam Long motocicletaId) {
        return motocicletaService.findMotocicleta(motocicletaId);
    }


    @GetMapping(path = "/getAll")
    public List<Motocicleta> findMotocicletas() {
        return motocicletaService.findAllMotocicletas();
    }

    @DeleteMapping("/{motocicletaIdParam}")
    public String deleteMotocicleta(@PathVariable("motocicletaIdParam") Long motocicletaId) {
        return motocicletaService.deleteMotocicleta(motocicletaId);
    }

}
