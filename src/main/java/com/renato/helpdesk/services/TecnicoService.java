package com.renato.helpdesk.services;


import com.renato.helpdesk.domain.Tecnico;
import com.renato.helpdesk.exceptions.ObjectnotFoundException;
import com.renato.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectnotFoundException("Objeto não encontrado! Id " + id ));


    }

    public List<Tecnico> findAll() {
        return repository.findAll();
    }
}
