package com.udg.products.controllers;

import com.udg.products.models.ProductModel;
import com.udg.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping()
    public ProductModel saveProduct(@RequestBody ProductModel product){
        return service.saveProduct(product);
    }

    @PutMapping()
    public ProductModel editProduct(@RequestBody ProductModel product){
        return service.editProduct(product);
    }

    @GetMapping()
    public ArrayList<ProductModel> getAllProducts(){
        return service.getAllProducts();
    }


    @GetMapping("/findProductById/{id}")
    public Optional<ProductModel> findProductById(@PathVariable Long id){
        return service.findProductById(id);
    }

    @GetMapping("/findProductByBarcode/{barcode}")
    public Optional<ArrayList<ProductModel>> findProductByBarcode(@PathVariable String barcode){
        return service.findProductByBarcode(barcode);
    }


    @GetMapping("/findProductByName/{name}")
    public Optional<ArrayList<ProductModel>> findProductByName(@PathVariable String name){
        return service.findProductByName(name);
    }
    @DeleteMapping("/delete-product-by-id")
    public String deleteProductById(@RequestParam("id") Long id){
        return service.deleteProductById(id);
    }


}
