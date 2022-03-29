package com.renato.helpdesk.repositories;

import com.renato.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository <Chamado, Integer> {
}
