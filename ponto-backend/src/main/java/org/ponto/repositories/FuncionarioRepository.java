package org.ponto.repositories;

import org.ponto.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}
