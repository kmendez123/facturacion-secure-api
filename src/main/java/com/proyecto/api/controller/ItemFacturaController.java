package com.proyecto.api.controller;

import com.proyecto.api.entity.ItemFactura;
import com.proyecto.api.service.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*")
public class ItemFacturaController {

    @Autowired
    private ItemFacturaService itemFacturaService;

    @GetMapping
    public ResponseEntity<List<ItemFactura>> listar() {
        return ResponseEntity.ok(itemFacturaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemFactura> obtenerPorId(@PathVariable Integer id) {
        return itemFacturaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ItemFactura> guardar(@RequestBody ItemFactura itemFactura) {
        return ResponseEntity.ok(itemFacturaService.guardar(itemFactura));
    }

    @PutMapping
    public ResponseEntity<ItemFactura> actualizar(@RequestBody ItemFactura itemFactura) {
        return ResponseEntity.ok(itemFacturaService.actualizar(itemFactura));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        itemFacturaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
