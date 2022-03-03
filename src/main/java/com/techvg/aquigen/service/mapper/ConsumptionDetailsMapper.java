package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.ConsumptionDetails;
import com.techvg.aquigen.service.dto.ConsumptionDetailsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ConsumptionDetails} and its DTO {@link ConsumptionDetailsDTO}.
 */
@Mapper(componentModel = "spring", uses = { ProductInventoryMapper.class })
public interface ConsumptionDetailsMapper extends EntityMapper<ConsumptionDetailsDTO, ConsumptionDetails> {
    @Mapping(target = "productInventory", source = "productInventory", qualifiedByName = "id")
    ConsumptionDetailsDTO toDto(ConsumptionDetails s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ConsumptionDetailsDTO toDtoId(ConsumptionDetails consumptionDetails);
}
