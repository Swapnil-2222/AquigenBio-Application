package com.techvg.aquigen.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuatationDetailsMapperTest {

    private QuatationDetailsMapper quatationDetailsMapper;

    @BeforeEach
    public void setUp() {
        quatationDetailsMapper = new QuatationDetailsMapperImpl();
    }
}
