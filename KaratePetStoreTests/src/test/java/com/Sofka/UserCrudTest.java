package com.Sofka;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

public class UserCrudTest {
    @Test
    public void testUserCrud() {
        Results results = Runner.path("classpath:features").parallel(1);
        org.junit.Assert.assertTrue("No se ejecuto ningun feature", results.getFeaturesTotal() > 0);
        org.junit.Assert.assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
}