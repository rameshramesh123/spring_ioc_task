package com.example.springIOC_Beans_IOC.Repository;

import com.example.springIOC_Beans_IOC.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
