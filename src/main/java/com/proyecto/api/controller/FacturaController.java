package com.proyecto.api.controller;

import com.proyecto.api.entity.Factura;
import com.proyecto.api.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin(origins = "*")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public ResponseEntity<List<Factura>> listar() {
        return ResponseEntity.ok(facturaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerPorId(@PathVariable Integer id) {
        return facturaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Factura> guardar(@RequestBody Factura factura) {
        return ResponseEntity.ok(facturaService.guardar(factura));
    }

    @PutMapping
    public ResponseEntity<Factura> actualizar(@RequestBody Factura factura) {
        return ResponseEntity.ok(facturaService.actualizar(factura));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        facturaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
