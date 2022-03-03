package com.techvg.aquigen.repository;

import com.techvg.aquigen.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Product entity.
 */
@Repository
public interface ProductRepository
    extends ProductRepositoryWithBagRelationships, JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    default Optional<Product> findOneWithEagerRelationships(Long id) {
        return this.fetchBagRelationships(this.findOneWithToOneRelationships(id));
    }

    default List<Product> findAllWithEagerRelationships() {
        return this.fetchBagRelationships(this.findAllWithToOneRelationships());
    }

    default Page<Product> findAllWithEagerRelationships(Pageable pageable) {
        return this.fetchBagRelationships(this.findAllWithToOneRelationships(pageable));
    }

    @Query(
        value = "select distinct product from Product product left join fetch product.categories left join fetch product.unit left join fetch product.securityUser",
        countQuery = "select count(distinct product) from Product product"
    )
    Page<Product> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct product from Product product left join fetch product.categories left join fetch product.unit left join fetch product.securityUser"
    )
    List<Product> findAllWithToOneRelationships();

    @Query(
        "select product from Product product left join fetch product.categories left join fetch product.unit left join fetch product.securityUser where product.id =:id"
    )
    Optional<Product> findOneWithToOneRelationships(@Param("id") Long id);
}