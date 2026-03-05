package com.company.asset;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdGeneratorTest {
    
    @Test
    void testGenerateBusinessId() {
        IdGenerator generator = new IdGenerator();

        String result = generator.generateBusinessId(100L, "Truck");

        assertEquals("TRUCK-100", result);
    }

}
