package com.renato.helpdesk;

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
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}


}

