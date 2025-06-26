package com.proyecto.api.service;

import com.proyecto.api.entity.Factura;

import java.util.List;
import java.util.Optional;

public interface FacturaService {
    List<Factura> listarTodos();
    Optional<Factura> buscarPorId(Integer id);
    Factura guardar(Factura factura);
    Factura actualizar(Factura factura);
    void eliminar(Integer id);
}
