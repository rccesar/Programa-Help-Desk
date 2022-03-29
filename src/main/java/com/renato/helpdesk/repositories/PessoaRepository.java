package com.renato.helpdesk.repositories;

import com.renato.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <Pessoa, Integer> {
}
