package com.proyecto.api.service;

import com.proyecto.api.entity.ItemFactura;

import java.util.List;
import java.util.Optional;

public interface ItemFacturaService {
    List<ItemFactura> listarTodos();
    Optional<ItemFactura> buscarPorId(Integer id);
    ItemFactura guardar(ItemFactura itemFactura);
    ItemFactura actualizar(ItemFactura itemFactura);
    void eliminar(Integer id);
}
