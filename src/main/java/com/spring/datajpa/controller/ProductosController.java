package com.spring.datajpa.controller;

import com.spring.datajpa.entity.Productos;
import com.spring.datajpa.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/productosApi")
@CrossOrigin(origins = "*")
@RestController
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @PostMapping
    public Productos saveProductos(@RequestBody Productos productosToSave) {
        return productosService.saveProductos(productosToSave);
    }
    @PostMapping(path = "listProductos")
    public List<Productos> saveListProductos(@RequestBody List<Productos> productosListToSave){
        return productosService.saveAllProductos(productosListToSave);
    }

    @GetMapping(path = "/getAllProductos")
    public List<Productos> findProductos() {
        return productosService.findAllProductos();
    }
}
