package com.proyecto.api.controller;

import com.proyecto.api.entity.Clasificacion;
import com.proyecto.api.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clasificaciones")
@CrossOrigin(origins = "*")
public class ClasificacionController {

    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping
    public ResponseEntity<List<Clasificacion>> listar() {
        return ResponseEntity.ok(clasificacionService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clasificacion> obtenerPorId(@PathVariable Integer id) {
        return clasificacionService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Clasificacion> guardar(@RequestBody Clasificacion clasificacion) {
        return ResponseEntity.ok(clasificacionService.guardar(clasificacion));
    }

    @PutMapping
    public ResponseEntity<Clasificacion> actualizar(@RequestBody Clasificacion clasificacion) {
        return ResponseEntity.ok(clasificacionService.actualizar(clasificacion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        clasificacionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
