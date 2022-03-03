package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.Product;
import com.techvg.aquigen.service.dto.ProductDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(
    componentModel = "spring",
    uses = { RawMaterialOrderMapper.class, CategoriesMapper.class, UnitMapper.class, SecurityUserMapper.class }
)
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
    @Mapping(target = "rawMaterialOrders", source = "rawMaterialOrders", qualifiedByName = "idSet")
    @Mapping(target = "categories", source = "categories", qualifiedByName = "name")
    @Mapping(target = "unit", source = "unit", qualifiedByName = "name")
    @Mapping(target = "securityUser", source = "securityUser", qualifiedByName = "name")
    ProductDTO toDto(Product s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProductDTO toDtoId(Product product);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<ProductDTO> toDtoIdSet(Set<Product> product);

    @Mapping(target = "removeRawMaterialOrder", ignore = true)
    Product toEntity(ProductDTO productDTO);
}
