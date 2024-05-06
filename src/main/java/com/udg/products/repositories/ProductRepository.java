package com.udg.products.repositories;

import com.udg.products.models.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {

    public Optional<ArrayList<ProductModel>> findProductModelByBarcode(String barcode);

    public Optional<ArrayList<ProductModel>> findProductModelByName(String name);
}
