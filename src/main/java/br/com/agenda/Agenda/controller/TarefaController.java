package br.com.agenda.Agenda.controller;

import org.springframework.web.bind.annotation.*;
import br.com.agenda.Agenda.model.Tarefa;
import br.com.agenda.Agenda.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
    @RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);
    }

    @GetMapping

    public List<Tarefa> listar() {
        return tarefaService.listarTodas();
    }
}
