package ru.mirea;

import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;


@MicronautTest
class TrppTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

}
