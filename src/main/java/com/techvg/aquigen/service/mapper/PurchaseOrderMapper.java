package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.PurchaseOrder;
import com.techvg.aquigen.service.dto.PurchaseOrderDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PurchaseOrder} and its DTO {@link PurchaseOrderDTO}.
 */
@Mapper(
    componentModel = "spring",
    uses = { ProductInventoryMapper.class, WarehouseMapper.class, SecurityUserMapper.class, RawMaterialOrderMapper.class }
)
public interface PurchaseOrderMapper extends EntityMapper<PurchaseOrderDTO, PurchaseOrder> {
    @Mapping(target = "productInventory", source = "productInventory", qualifiedByName = "id")
    @Mapping(target = "warehouse", source = "warehouse", qualifiedByName = "id")
    @Mapping(target = "securityUser", source = "securityUser", qualifiedByName = "firstName")
    @Mapping(target = "rawMaterialOrder", source = "rawMaterialOrder", qualifiedByName = "id")
    PurchaseOrderDTO toDto(PurchaseOrder s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PurchaseOrderDTO toDtoId(PurchaseOrder purchaseOrder);
}