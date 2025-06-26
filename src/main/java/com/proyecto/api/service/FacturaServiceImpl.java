package com.proyecto.api.service;

import com.proyecto.api.entity.Factura;
import com.proyecto.api.repository.FacturaRepository;
import com.proyecto.api.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> listarTodos() {
        return facturaRepository.findAll();
    }

    @Override
    public Optional<Factura> buscarPorId(Integer id) {
        return facturaRepository.findById(id);
    }

    @Override
    public Factura guardar(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura actualizar(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public void eliminar(Integer id) {
        facturaRepository.deleteById(id);
    }
}
