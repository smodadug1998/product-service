package com.ecommerce.product.service;

import com.ecommerce.product.request.ProductRequest;
import com.ecommerce.product.response.ProductResponse;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);

    Optional<ProductResponse> updateProduct(Long productId, ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    boolean deleteProduct(Long productId);

    List<ProductResponse> searchProducts(String keyword);

    Optional<ProductResponse> getProductById(Long productId);
}
