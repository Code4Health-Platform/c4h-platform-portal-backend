package cloud.c4h.platform.service.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class ThinkEhrRestClientTest {
    private ThinkEhrRestClient impl;

    @Before
    public void setUp() {
        impl = new ThinkEhrRestClient();
        impl.setCdrUrl("http://127.0.0.1:8080");
        impl.setAdminName("admin");
        impl.setPassword("admin");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void createPatient() {
    }

    @Test
    public void createEhr() {
    }

    @Test
    public void createComposition() {
    }

    @Test
    public void uploadTemplate() {
    }

    @Test
    public void createDomain() throws URISyntaxException {
        String testString = "ThinkEhrRestClientTest " + DateFormat.getDateTimeInstance().format(new Date());
        ResponseEntity<String> response = impl.createDomain(UUID.randomUUID().toString(), testString);

        System.out.println(response.toString());

        Assert.assertTrue(response.getStatusCode().is2xxSuccessful());
    }

    @Test
    public void createUser() {
    }
}
