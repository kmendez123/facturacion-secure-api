package com.proyecto.api.service;

import com.proyecto.api.entity.Clasificacion;
import com.proyecto.api.repository.ClasificacionRepository;
import com.proyecto.api.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasificacionServiceImpl implements ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    @Override
    public List<Clasificacion> listarTodos() {
        return clasificacionRepository.findAll();
    }

    @Override
    public Optional<Clasificacion> buscarPorId(Integer id) {
        return clasificacionRepository.findById(id);
    }

    @Override
    public Clasificacion guardar(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    @Override
    public Clasificacion actualizar(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    @Override
    public void eliminar(Integer id) {
        clasificacionRepository.deleteById(id);
    }
}
