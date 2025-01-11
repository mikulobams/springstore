package com.zollo.springstore.repository;

import com.zollo.springstore.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    @RestResource(exported = true)
//    <S extends Product> S save(S entity);
//
//
//    @RestResource(exported = true)
//    void deleteById(Long id);
}
