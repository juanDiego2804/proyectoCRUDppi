package com.udg.products.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @Column(unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String barcode;//codigo de barras
    private String supplier;//proveedoremail
    private String category;//degree
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String code) {
        this.barcode = code;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String email) {
        this.supplier = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String degree) {
        this.category = degree;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double score) {
        this.price = score;
    }
}
