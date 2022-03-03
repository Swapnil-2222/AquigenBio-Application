package com.techvg.aquigen.repository;

import com.techvg.aquigen.domain.ProductTransaction;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;

public interface ProductTransactionRepositoryWithBagRelationships {
    Optional<ProductTransaction> fetchBagRelationships(Optional<ProductTransaction> productTransaction);

    List<ProductTransaction> fetchBagRelationships(List<ProductTransaction> productTransactions);

    Page<ProductTransaction> fetchBagRelationships(Page<ProductTransaction> productTransactions);
}
