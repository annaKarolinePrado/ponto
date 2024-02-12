package org.ponto.repositories;

import org.ponto.models.Funcionario;
import org.ponto.models.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
    List<Ponto> findAllByDataPonto(LocalDate data);
}
