package com.invillia.reinvent.productcatalog.controller;

import com.invillia.reinvent.productcatalog.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductCatalogController {

    @GetMapping
    public List<Product> listProduct(){

        List<Product> productList = new ArrayList<>() {{
            add(new Product("123", "Produto X", new BigDecimal("10.99")));
            add(new Product("456", "Produto Y", new BigDecimal("99.70")));
        }};

        return productList;
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable String id){
        return new Product(id, "Produto X",new BigDecimal("10.99"));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return product;
    }
}
