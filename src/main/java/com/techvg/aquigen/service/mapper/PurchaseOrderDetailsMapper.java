package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.PurchaseOrderDetails;
import com.techvg.aquigen.service.dto.PurchaseOrderDetailsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PurchaseOrderDetails} and its DTO {@link PurchaseOrderDetailsDTO}.
 */
@Mapper(componentModel = "spring", uses = { PurchaseOrderMapper.class, ProductMapper.class, UnitMapper.class })
public interface PurchaseOrderDetailsMapper extends EntityMapper<PurchaseOrderDetailsDTO, PurchaseOrderDetails> {
    @Mapping(target = "purchaseOrder", source = "purchaseOrder", qualifiedByName = "id")
    @Mapping(target = "product", source = "product", qualifiedByName = "productName")
    @Mapping(target = "unit", source = "unit", qualifiedByName = "unitName")
    PurchaseOrderDetailsDTO toDto(PurchaseOrderDetails s);
}
