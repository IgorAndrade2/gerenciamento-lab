package com.senai.backend.gerenciamento_lab.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.gerenciamento_lab.models.Equipamento;
import com.senai.backend.gerenciamento_lab.services.EquipamentoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

    @Autowired
    public EquipamentoService equipamentoService; 

    @PostMapping("/salvar")
    public Equipamento salvar(@RequestBody Equipamento equipamento){
        return equipamentoService.salvar(equipamento);
    }

     // ✅ Buscar por ID (GET)
    @GetMapping("/{id}")
    public Optional<Equipamento> buscarPorId(@PathVariable Integer id) {
        return equipamentoService.buscarPorId(id);
    }

    // ✅ Listar todos (GET)
    @GetMapping("/listar")
    public List<Equipamento> listarTodos() {
        return equipamentoService.listarTodos();
    }

    // ✅ Contar registros (GET)
    @GetMapping("/contar")
    public Long contar() {
        return equipamentoService.contar();
    }

    // ✅ Remover por ID (DELETE)
    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable Integer id) {
        equipamentoService.remover(id);
    }
}
