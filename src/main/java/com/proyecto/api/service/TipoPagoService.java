package com.proyecto.api.service;

import com.proyecto.api.entity.TipoPago;

import java.util.List;
import java.util.Optional;

public interface TipoPagoService {
    List<TipoPago> listarTodos();
    Optional<TipoPago> buscarPorId(Integer id);
    TipoPago guardar(TipoPago tipoPago);
    TipoPago actualizar(TipoPago tipoPago);
    void eliminar(Integer id);
}
