package com.techvg.aquigen.repository;

import com.techvg.aquigen.domain.ProductQuatation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ProductQuatation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductQuatationRepository extends JpaRepository<ProductQuatation, Long>, JpaSpecificationExecutor<ProductQuatation> {}
