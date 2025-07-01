package br.com.agenda.Agenda.repository;

import br.com.agenda.Agenda.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
