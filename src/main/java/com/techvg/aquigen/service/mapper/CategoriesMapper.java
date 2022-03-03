package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.Categories;
import com.techvg.aquigen.service.dto.CategoriesDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Categories} and its DTO {@link CategoriesDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CategoriesMapper extends EntityMapper<CategoriesDTO, Categories> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CategoriesDTO toDtoId(Categories categories);

    @Named("categoryName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "categoryName", source = "categoryName")
    CategoriesDTO toDtoCategoryName(Categories categories);
}
