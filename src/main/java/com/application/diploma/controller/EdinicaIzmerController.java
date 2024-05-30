package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Edinica_izmer;
import com.application.diploma.service.EdinicaIzmerService;

@RestController
public class EdinicaIzmerController {

    private final EdinicaIzmerService edinicaIzmerService;

    public EdinicaIzmerController(EdinicaIzmerService edinicaIzmerService) {
        this.edinicaIzmerService = edinicaIzmerService;
    }

    @GetMapping("/edizmer")
    public List<Edinica_izmer> getAllEdinica_izmers() {
        return edinicaIzmerService.getAllEdinica_izmers();
    }

    @PostMapping("/edizmer/add")
    public Boolean add(@RequestBody Edinica_izmer edinica_izmer) {
        System.out.println("model is " + (edinica_izmer == null ? "nope " : edinica_izmer.getPk_ed_izmer()));
        return edinicaIzmerService.add(edinica_izmer);
    }

    @DeleteMapping("/edizmer/delete")
    public Boolean delete(@RequestBody Edinica_izmer edinica_izmer) {
        System.out.println("Deleting edizmer: " + edinica_izmer.getPk_ed_izmer());
        return edinicaIzmerService.delete(edinica_izmer);
    }

}
