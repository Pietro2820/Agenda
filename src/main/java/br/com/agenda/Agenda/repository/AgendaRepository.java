package br.com.agenda.Agenda.repository;

import br.com.agenda.Agenda.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
