package com.proyecto.api.controller;

import com.proyecto.api.entity.TipoPago;
import com.proyecto.api.service.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipopago")
@CrossOrigin(origins = "*")
public class TipoPagoController {

    @Autowired
    private TipoPagoService tipoPagoService;

    @GetMapping
    public ResponseEntity<List<TipoPago>> listar() {
        return ResponseEntity.ok(tipoPagoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoPago> obtenerPorId(@PathVariable Integer id) {
        return tipoPagoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TipoPago> guardar(@RequestBody TipoPago tipoPago) {
        return ResponseEntity.ok(tipoPagoService.guardar(tipoPago));
    }

    @PutMapping
    public ResponseEntity<TipoPago> actualizar(@RequestBody TipoPago tipoPago) {
        return ResponseEntity.ok(tipoPagoService.actualizar(tipoPago));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        tipoPagoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
