package com.bjss.mjwilson.gha;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class GhaTest {

    @Test
    void shouldReturnSeven() {
        final Gha gha = new Gha();
        assertThat(gha.seven()).isEqualTo(7);
    }
}
