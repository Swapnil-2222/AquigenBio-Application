package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.QuatationDetails;
import com.techvg.aquigen.service.dto.QuatationDetailsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link QuatationDetails} and its DTO {@link QuatationDetailsDTO}.
 */
@Mapper(componentModel = "spring", uses = { ProductMapper.class, UnitMapper.class, CategoriesMapper.class, ProductQuatationMapper.class })
public interface QuatationDetailsMapper extends EntityMapper<QuatationDetailsDTO, QuatationDetails> {
    @Mapping(target = "product", source = "product", qualifiedByName = "id")
    @Mapping(target = "unit", source = "unit", qualifiedByName = "id")
    @Mapping(target = "categories", source = "categories", qualifiedByName = "id")
    @Mapping(target = "productQuatation", source = "productQuatation", qualifiedByName = "id")
    QuatationDetailsDTO toDto(QuatationDetails s);
}
