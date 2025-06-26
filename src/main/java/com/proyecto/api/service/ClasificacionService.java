package com.proyecto.api.service;

import com.proyecto.api.entity.Clasificacion;

import java.util.List;
import java.util.Optional;

public interface ClasificacionService {
    List<Clasificacion> listarTodos();
    Optional<Clasificacion> buscarPorId(Integer id);
    Clasificacion guardar(Clasificacion clasificacion);
    Clasificacion actualizar(Clasificacion clasificacion);
    void eliminar(Integer id);
}
