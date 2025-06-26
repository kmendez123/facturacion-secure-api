package com.proyecto.api.service;

import com.proyecto.api.entity.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> listarTodos();
    Optional<Persona> buscarPorId(Integer id);
    Persona guardar(Persona persona);
    Persona actualizar(Persona persona);
    void eliminar(Integer id);
}
