package com.example.lab2.controller;

import com.example.lab2.dto.ProductDTO;
import com.example.lab2.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }


    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable int id){
        return productService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody ProductDTO productDTO){
        productService.save(productDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDTO productDTO){
        productService.update(id, productDTO);
    }


}
