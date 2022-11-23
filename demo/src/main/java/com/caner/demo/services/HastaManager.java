package com.caner.demo.services;


import com.caner.demo.entities.Hasta;
import com.caner.demo.entities.User;
import com.caner.demo.repos.HastaRepository;
import com.caner.demo.requests.HastaRequest;
import com.caner.demo.responses.HastaResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class HastaManager implements HastaService {

    private final HastaRepository hastaRepository;

    public HastaManager(HastaRepository hastaRepository) {
        this.hastaRepository = hastaRepository;
    }

    @Override
    public List<HastaResponse> getAll() {

        return this.hastaRepository.findAll().stream().map(hasta -> {
            return new HastaResponse(hasta.getHasta_id(),hasta.getAdi(),hasta.getSoyadi(),hasta.getHastalik());
        }).toList();
    }

    @Override
    public Hasta saveHasta(HastaRequest newHasta) {
        Hasta hasta = new Hasta();
        hasta.setAdi(newHasta.getAdi());
        hasta.setSoyadi(newHasta.getSoyadi());
        hasta.setHastalik(newHasta.getHastalik());
        return hastaRepository.save(hasta);

    }

    @Override
    public Hasta deleteHasta(Long hastaId) {
        hastaRepository.deleteById(hastaId);
        return null;
    }

    @Override
    public Hasta updateUser(Hasta newHasta) {
        Optional<Hasta> hasta = hastaRepository.findById(newHasta.getHasta_id());
        if (hasta.isPresent()) {
            Hasta foundUser = hasta.get();
            foundUser.setAdi(newHasta.getAdi());
            foundUser.setSoyadi(newHasta.getSoyadi());
            foundUser.setHastalik(newHasta.getHastalik());
            hastaRepository.save(foundUser);
            return foundUser;
        } else
            return null;
    }

}


