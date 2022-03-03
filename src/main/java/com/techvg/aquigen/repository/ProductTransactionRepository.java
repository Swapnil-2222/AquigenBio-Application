package com.techvg.aquigen.repository;

import com.techvg.aquigen.domain.ProductTransaction;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ProductTransaction entity.
 */
@Repository
public interface ProductTransactionRepository
    extends
        ProductTransactionRepositoryWithBagRelationships,
        JpaRepository<ProductTransaction, Long>,
        JpaSpecificationExecutor<ProductTransaction> {
    default Optional<ProductTransaction> findOneWithEagerRelationships(Long id) {
        return this.fetchBagRelationships(this.findById(id));
    }

    default List<ProductTransaction> findAllWithEagerRelationships() {
        return this.fetchBagRelationships(this.findAll());
    }

    default Page<ProductTransaction> findAllWithEagerRelationships(Pageable pageable) {
        return this.fetchBagRelationships(this.findAll(pageable));
    }
}
