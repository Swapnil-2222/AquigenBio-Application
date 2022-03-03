package com.techvg.aquigen.service.mapper;

import com.techvg.aquigen.domain.TranferDetailsApprovals;
import com.techvg.aquigen.service.dto.TranferDetailsApprovalsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TranferDetailsApprovals} and its DTO {@link TranferDetailsApprovalsDTO}.
 */
@Mapper(componentModel = "spring", uses = { TransferMapper.class })
public interface TranferDetailsApprovalsMapper extends EntityMapper<TranferDetailsApprovalsDTO, TranferDetailsApprovals> {
    @Mapping(target = "transfer", source = "transfer", qualifiedByName = "id")
    TranferDetailsApprovalsDTO toDto(TranferDetailsApprovals s);
}
