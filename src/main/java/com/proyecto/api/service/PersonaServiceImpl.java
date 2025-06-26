package com.proyecto.api.service;

import com.proyecto.api.entity.Persona;
import com.proyecto.api.repository.PersonaRepository;
import com.proyecto.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listarTodos() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> buscarPorId(Integer id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void eliminar(Integer id) {
        personaRepository.deleteById(id);
    }
}
