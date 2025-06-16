package com.ecommerce.product.repo;

import com.ecommerce.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByActiveTrue();

    @Query("SELECT p from Product p where p.active = true AND p.stockQuantity > 0 and lower(p.name) like lower(concat('%', :keyword, '%') ) ")
    List<Product> searchProducts(@Param("keyword") String keyword);

    Optional<Product> findByIdAndActiveTrue(Long productId);
}
