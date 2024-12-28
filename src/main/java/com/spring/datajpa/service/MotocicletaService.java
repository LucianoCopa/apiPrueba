package com.spring.datajpa.service;

import com.spring.datajpa.entity.Motocicleta;
import com.spring.datajpa.repository.MotocicletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MotocicletaService {

    @Autowired
    private MotocicletaRepository motocicletaRepository;

    public Motocicleta saveMotocicleta(Motocicleta motocletaToSave) {
        motocletaToSave.setFechaAlta(new Date());
        return motocicletaRepository.save(motocletaToSave);
    }

    public Motocicleta updateMotocicleta(Motocicleta motocletaToUpdate) {
/*        el save es un metodo ya nos provee jpa,
        asi varios metodos para cubrir operaciones basicas sobre la base de datos*/
        motocletaToUpdate.setFechaModificacion(new Date());
        return motocicletaRepository.save(motocletaToUpdate);
    }

    public Motocicleta findMotocicleta(Long motocicletaId) {
        return motocicletaRepository.findById(motocicletaId).get();
    }

    public List<Motocicleta> findAllMotocicletas() {
        return motocicletaRepository.findAll();
    }

    public String deleteMotocicleta(Long motocicletaId) {
        motocicletaRepository.deleteById(motocicletaId);
        return "Motocicleta con el Id " + motocicletaId + " ha sido eliminada exitosamente";
    }
}
