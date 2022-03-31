package com.renato.helpdesk.services;


import com.renato.helpdesk.domain.Chamado;
import com.renato.helpdesk.domain.Cliente;
import com.renato.helpdesk.domain.Tecnico;
import com.renato.helpdesk.domain.enums.Perfil;
import com.renato.helpdesk.domain.enums.Prioridade;
import com.renato.helpdesk.domain.enums.Status;
import com.renato.helpdesk.repositories.ChamadoRepository;
import com.renato.helpdesk.repositories.ClienteRepository;
import com.renato.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {


    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public DBService() {
    }


    public void instanciaDB(){

        Tecnico tec1 = new Tecnico(null, "Windows cezar","12345678999","windows@mail.com","123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Linux Debian","78945612333","linux@mail.com","123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO,"Chamado 01","Primeiro Chamado",tec1,cli1);


        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }


}
