package com.udg.products.services;

import com.udg.products.models.ProductModel;
import com.udg.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    //CRUD

    public ProductModel saveProduct(ProductModel product){
        if(repository.findProductModelByBarcode(product.getBarcode()).toString().equals("Optional[[]]")){
            return repository.save(product);
        }else{
            //retornar un error de repetido
            ProductModel productError = new ProductModel();
                productError.setId(-1L);
            return productError;
        }



    }

    public ArrayList<ProductModel> getAllProducts(){
        return (ArrayList<ProductModel>) repository.findAll();
    }

    public Optional<ProductModel> findProductById(Long id){
        return repository.findById(id);
    }



    public ProductModel editProduct(ProductModel product){
        return repository.save(product);
    }

    public String deleteProductById(Long id){

        if(findProductById(id).isPresent()){
            repository.deleteById(id);
            return "product deleted successfully";
        }else {
            return "product with id="+ id+ " not foud";
        }
    }

    public Optional<ArrayList<ProductModel>> findProductByBarcode(String barcode){
        return repository.findProductModelByBarcode(barcode);
    }
    public Optional<ArrayList<ProductModel>> findProductByName(String name){
        return repository.findProductModelByName(name);
    }
}
