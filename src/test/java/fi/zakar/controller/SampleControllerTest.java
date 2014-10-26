package fi.zakar.controller;

import fi.zakar.SampleSimpleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleSimpleApplication.class)
public class SampleControllerTest {

    @Autowired
    SampleController ctrl;

    @Autowired
    ApplicationContext ctx;

    @Test
    public void testContextLoads() throws Exception {
        assertNotNull(this.ctx);
        assertTrue(this.ctx.containsBean("helloWorldService"));
        assertTrue(this.ctx.containsBean("sampleSimpleApplication"));
    }
    @Test
    public void testIndex() {
        final String output = ctrl.sayHello();
        assertTrue("Wrong output: " + output, output.contains("Hello Phil"));
    }
}