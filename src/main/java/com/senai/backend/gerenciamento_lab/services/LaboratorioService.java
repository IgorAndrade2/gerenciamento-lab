package com.senai.backend.gerenciamento_lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerenciamento_lab.models.Laboratorio;
import com.senai.backend.gerenciamento_lab.repositories.LaboratorioRepository;

@Service
public class LaboratorioService {
    @Autowired
    private LaboratorioRepository laboratorioRepository;
    public Laboratorio salvar(Laboratorio laboratorio){
        return laboratorioRepository.save(laboratorio);
    }

     public Optional<Laboratorio> buscarPorId(Integer id) {
        return laboratorioRepository.findById(id);
    }

    public List<Laboratorio> listarTodos() {
        return laboratorioRepository.findAll();
    }

    public Long contar() {
        return laboratorioRepository.count();
    }

    public void remover(Integer id) {
        laboratorioRepository.deleteById(id);
    }
}
