package uk.co.zenitech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    private final Service service = new Service();

    @Test
    void testsService() {
        Assertions.assertTrue(service.isInRange(5));
    }

    @Test
    void testsService2() {
        Assertions.assertFalse(service.isInRange(0));
        Assertions.assertTrue(service.isInRange(54));
        Assertions.assertFalse(service.isInRange(1000));
    }
}
