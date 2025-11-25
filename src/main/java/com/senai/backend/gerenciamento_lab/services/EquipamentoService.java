package com.senai.backend.gerenciamento_lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerenciamento_lab.models.Equipamento;
import com.senai.backend.gerenciamento_lab.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {

     @Autowired
    private EquipamentoRepository equipamentoRepository;
    public Equipamento salvar(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
    }

     public Optional<Equipamento> buscarPorId(Integer id) {
        return equipamentoRepository.findById(id);
    }

    public List<Equipamento> listarTodos() {
        return equipamentoRepository.findAll();
    }

    public Long contar() {
        return equipamentoRepository.count();
    }

    public void remover(Integer id) {
        equipamentoRepository.deleteById(id);
    }

}
