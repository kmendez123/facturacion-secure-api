package com.proyecto.api.service;

import com.proyecto.api.entity.Rol;
import java.util.List;
import java.util.Optional;

public interface RolService {
    List<Rol> listarTodos();
    Optional<Rol> buscarPorId(Integer id);
    Rol guardar(Rol rol);
    Rol actualizar(Rol rol);
    void eliminar(Integer id);
}
