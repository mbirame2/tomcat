package com.devweb.RH.controller;

import com.devweb.RH.model.Partenaire;
import com.devweb.RH.repository.PartenaireRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin

@RequestMapping(value = "/partenaire") // comme symfony Api/...
public class PartenaireControleur {

    @Autowired // sa permet de donner le reference de l'objet
    private PartenaireRepository partenaireRepository;

    @GetMapping(value = "/liste")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Partenaire> list(){
        return  partenaireRepository.findAll();
    }

    @PostMapping (value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Partenaire add(@RequestBody(required = false) Partenaire s){
        return  partenaireRepository.save(s); // on peut utiliser aussi saveOnUpdate   return "redirect:/user";
    }
}
