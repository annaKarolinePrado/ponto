package org.ponto.repositories;

import org.ponto.models.Funcionario;
import org.ponto.models.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoRepository extends JpaRepository<Ponto, Long> {

}
