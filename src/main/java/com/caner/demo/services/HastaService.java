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


public interface HastaService {
   List<HastaResponse> getAll();


    Hasta saveHasta(HastaRequest newHasta);

    Hasta deleteHasta(Long hastaId);

    Hasta updateUser(Hasta newHasta);
}
