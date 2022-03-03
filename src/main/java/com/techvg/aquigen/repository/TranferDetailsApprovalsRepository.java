package com.techvg.aquigen.repository;

import com.techvg.aquigen.domain.TranferDetailsApprovals;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TranferDetailsApprovals entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TranferDetailsApprovalsRepository
    extends JpaRepository<TranferDetailsApprovals, Long>, JpaSpecificationExecutor<TranferDetailsApprovals> {}
