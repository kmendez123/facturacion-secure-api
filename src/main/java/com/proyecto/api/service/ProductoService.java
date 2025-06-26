package com.proyecto.api.service;

import com.proyecto.api.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listarTodos();
    Optional<Producto> buscarPorId(Integer id);
    Producto guardar(Producto producto);
    Producto actualizar(Producto producto);
    void eliminar(Integer id);
}
