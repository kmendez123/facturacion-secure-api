package com.proyecto.api.service;

import com.proyecto.api.entity.Rol;
import com.proyecto.api.repository.RolRepository;
import com.proyecto.api.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> listarTodos() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> buscarPorId(Integer id) {
        return rolRepository.findById(id);
    }

    @Override
    public Rol guardar(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol actualizar(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public void eliminar(Integer id) {
        rolRepository.deleteById(id);
    }
}
