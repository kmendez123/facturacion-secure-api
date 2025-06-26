package com.proyecto.api.service;

import com.proyecto.api.entity.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    List<Proveedor> listarTodos();
    Optional<Proveedor> buscarPorId(Integer id);
    Proveedor guardar(Proveedor proveedor);
    Proveedor actualizar(Proveedor proveedor);
    void eliminar(Integer id);
}
