package com.techvg.aquigen.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TranferDetailsApprovalsMapperTest {

    private TranferDetailsApprovalsMapper tranferDetailsApprovalsMapper;

    @BeforeEach
    public void setUp() {
        tranferDetailsApprovalsMapper = new TranferDetailsApprovalsMapperImpl();
    }
}
