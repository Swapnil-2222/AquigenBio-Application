package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.Unit;
import com.techvg.aquigen.service.dto.UnitDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Unit} and its DTO {@link UnitDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface UnitMapper extends EntityMapper<UnitDTO, Unit> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UnitDTO toDtoId(Unit unit);

    @Named("unitName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "unitName", source = "unitName")
    UnitDTO toDtoUnitName(Unit unit);
}
