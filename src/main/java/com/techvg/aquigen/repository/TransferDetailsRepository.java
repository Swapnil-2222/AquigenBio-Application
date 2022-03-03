package com.techvg.aquigen.repository;

import com.techvg.aquigen.domain.TransferDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TransferDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransferDetailsRepository extends JpaRepository<TransferDetails, Long>, JpaSpecificationExecutor<TransferDetails> {}
