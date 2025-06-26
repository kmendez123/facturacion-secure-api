package com.proyecto.api.service;

import com.proyecto.api.entity.TipoPago;
import com.proyecto.api.repository.TipoPagoRepository;
import com.proyecto.api.service.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPagoServiceImpl implements TipoPagoService {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @Override
    public List<TipoPago> listarTodos() {
        return tipoPagoRepository.findAll();
    }

    @Override
    public Optional<TipoPago> buscarPorId(Integer id) {
        return tipoPagoRepository.findById(id);
    }

    @Override
    public TipoPago guardar(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @Override
    public TipoPago actualizar(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @Override
    public void eliminar(Integer id) {
        tipoPagoRepository.deleteById(id);
    }
}
