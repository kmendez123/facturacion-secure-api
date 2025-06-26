package com.proyecto.api.service;

import com.proyecto.api.entity.ItemFactura;
import com.proyecto.api.repository.ItemFacturaRepository;
import com.proyecto.api.service.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemFacturaServiceImpl implements ItemFacturaService {

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    @Override
    public List<ItemFactura> listarTodos() {
        return itemFacturaRepository.findAll();
    }

    @Override
    public Optional<ItemFactura> buscarPorId(Integer id) {
        return itemFacturaRepository.findById(id);
    }

    @Override
    public ItemFactura guardar(ItemFactura itemFactura) {
        return itemFacturaRepository.save(itemFactura);
    }

    @Override
    public ItemFactura actualizar(ItemFactura itemFactura) {
        return itemFacturaRepository.save(itemFactura);
    }

    @Override
    public void eliminar(Integer id) {
        itemFacturaRepository.deleteById(id);
    }
}
