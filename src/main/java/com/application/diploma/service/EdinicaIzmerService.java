package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Edinica_izmer;
import com.application.diploma.repository.EdinicaIzmerRepository;

@Service
public class EdinicaIzmerService {

    private final EdinicaIzmerRepository edinicaIzmerRepository;

    public EdinicaIzmerService(EdinicaIzmerRepository edinicaIzmerRepository) {
        this.edinicaIzmerRepository = edinicaIzmerRepository;
    }

    public List<Edinica_izmer> getAllEdinica_izmers() {
        return edinicaIzmerRepository.findAll();
    }

    public Boolean add(Edinica_izmer edinica_izmer) {
        try {
            edinicaIzmerRepository.save(edinica_izmer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(Edinica_izmer edinica_izmer) {
        try {
            edinicaIzmerRepository.delete(edinica_izmer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
