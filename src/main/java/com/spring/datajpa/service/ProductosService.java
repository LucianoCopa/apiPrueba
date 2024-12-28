package com.spring.datajpa.service;

import com.spring.datajpa.entity.Productos;
import com.spring.datajpa.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    public Productos saveProductos(Productos productosToSave) {
        return productosRepository.save(productosToSave);
    }

    public List<Productos> saveAllProductos(List<Productos> productosListToSave) {
        return productosRepository.saveAll(productosListToSave);
    }

    public List<Productos> findAllProductos() {
        return productosRepository.findAll();
    }
}
