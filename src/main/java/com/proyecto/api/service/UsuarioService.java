package com.proyecto.api.service;

import com.proyecto.api.entity.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listarTodos();
    Optional<Usuario> buscarPorId(Integer id);
    Usuario guardar(Usuario usuario);
    Usuario actualizar(Usuario usuario);
    void eliminar(Integer id);
}
