package com.company;

import com.company.cusdec.CusdecBundle;
import org.apache.camel.test.junit4.CamelSpringJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.IOException;

@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/config-test.xml")
public class NetValueBeanSpringTest {
    @Autowired
    NetValueBean bean;

    Unmarshaller u;

    @Test
    public void testFileParsedLower() throws IOException, JAXBException {
        CusdecBundle bundle = (CusdecBundle)u.unmarshal(new FileInputStream("src/test/data/cusdec1.xml"));
        Assert.assertFalse(bean.checkNetValueForApproval(bundle));
    }

    @Test
    public void testFileParsedHigher() throws IOException, JAXBException {
        CusdecBundle bundle = (CusdecBundle)u.unmarshal(new FileInputStream("src/test/data/cusdec2.xml"));
        Assert.assertTrue(bean.checkNetValueForApproval(bundle));
    }

    @Before
    public void setUp () throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CusdecBundle.class);
        u = context.createUnmarshaller();
    }

}
