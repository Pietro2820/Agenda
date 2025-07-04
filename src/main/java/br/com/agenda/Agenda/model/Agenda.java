package br.com.agenda.Agenda.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarefa> tarefas;
}
