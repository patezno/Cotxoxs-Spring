package org.lasencinas.cotxoxsSpring.service;

import org.lasencinas.cotxoxsSpring.domain.Carrera;
import org.lasencinas.cotxoxsSpring.repository.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepo carreraRepo;

    @Transactional
    public Long crearCarrera(String tarjetaCredito, String origen, String destino, int distancia, int coste) {
        Carrera carrera = new Carrera();
        carrera.setTarjetaCredito(tarjetaCredito);
        carrera.setOrigen(origen);
        carrera.setDestino(destino);
        carrera.setDistancia(distancia);
        carrera.setCosteTotal(coste);
        carreraRepo.save(carrera);
        return carrera.getId();
    }

    public Carrera recuperaCarrera(Long idCarrera) {
        return carreraRepo.findById(idCarrera).get();
    }
}
