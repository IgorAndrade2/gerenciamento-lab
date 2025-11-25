package com.senai.backend.gerenciamento_lab.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.senai.backend.gerenciamento_lab.models.Laboratorio;
import com.senai.backend.gerenciamento_lab.services.LaboratorioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class LaboratorioController {

    @Autowired
    public LaboratorioService laboratorioService; 

    @PostMapping("/salvar")
    public Laboratorio salvar(@RequestBody Laboratorio laboratorio){
        return laboratorioService.salvar(laboratorio);
    }

     // ✅ Buscar por ID (GET)
    @GetMapping("/{id}")
    public Optional<Laboratorio> buscarPorId(@PathVariable Integer id) {
        return laboratorioService.buscarPorId(id);
    }

    // ✅ Listar todos (GET)
    @GetMapping("/listar")
    public List<Laboratorio> listarTodos() {
        return laboratorioService.listarTodos();
    }

    // ✅ Contar registros (GET)
    @GetMapping("/contar")
    public Long contar() {
        return laboratorioService.contar();
    }

    // ✅ Remover por ID (DELETE)
    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable Integer id) {
        laboratorioService.remover(id);
    }

}
