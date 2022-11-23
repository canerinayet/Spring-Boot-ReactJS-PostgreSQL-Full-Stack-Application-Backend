package com.caner.demo.controllers;
import com.caner.demo.entities.Hasta;
import com.caner.demo.entities.User;
import com.caner.demo.requests.HastaRequest;
import com.caner.demo.responses.HastaResponse;
import com.caner.demo.services.HastaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hasta")

public class HastaController {
    private HastaService hastaService;

    public HastaController(HastaService hastaService) {
        this.hastaService = hastaService;
    }



    @GetMapping
    public List<HastaResponse> getAll() {
        return hastaService.getAll();
    }


    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody HastaRequest newHasta) {
        Hasta hasta = hastaService.saveHasta(newHasta);
        if(hasta != null)
            return new ResponseEntity<>(HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/{hastaId}")
    public void deleteId(@PathVariable Long hastaId) {
        hastaService.deleteHasta(hastaId);
    }
    @PostMapping("/update")
    public ResponseEntity<Void> updateUser(@RequestBody Hasta newHasta) {
        Hasta hasta = hastaService.updateUser(newHasta);
        if(hasta != null)
            return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    }
}