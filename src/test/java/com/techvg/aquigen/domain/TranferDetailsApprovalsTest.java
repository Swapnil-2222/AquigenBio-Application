package com.techvg.aquigen.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.techvg.aquigen.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class TranferDetailsApprovalsTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(TranferDetailsApprovals.class);
        TranferDetailsApprovals tranferDetailsApprovals1 = new TranferDetailsApprovals();
        tranferDetailsApprovals1.setId(1L);
        TranferDetailsApprovals tranferDetailsApprovals2 = new TranferDetailsApprovals();
        tranferDetailsApprovals2.setId(tranferDetailsApprovals1.getId());
        assertThat(tranferDetailsApprovals1).isEqualTo(tranferDetailsApprovals2);
        tranferDetailsApprovals2.setId(2L);
        assertThat(tranferDetailsApprovals1).isNotEqualTo(tranferDetailsApprovals2);
        tranferDetailsApprovals1.setId(null);
        assertThat(tranferDetailsApprovals1).isNotEqualTo(tranferDetailsApprovals2);
    }
}
