package com.company;

import com.company.cusdec.CusdecBundle;
import com.company.cusdec.CusdecDocument;
import com.company.cusdec.CusdecLine;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class CusdecParsingTest {
    Marshaller marshall;
    Unmarshaller unmarshall;

    @Test
    public void testMarshall() throws JAXBException, IOException {
        StringWriter writer = new StringWriter();
        CusdecDocument doc = new CusdecDocument();
        doc.setName("914");
        doc.setId("SIRF40083214658");
        doc.setTotalNetWeight(2.7f);
        doc.setTotalNetWeightUom("KGM");
        doc.setAirWaybill("M1052_002");
        doc.setHouseAirWaybill("H1052_002");
        doc.setCarrierCode("172");
        doc.setTotalNetAmount(2480.0);
        doc.setTotalNetAmountCurrency("EUR");
        CusdecLine line = new CusdecLine();
        line.setNumber("000001");
        line.setProductNumber("6DL31008AC03");
        line.setQuantity(1);
        line.setQuantityUom("PCE");
        line.setNetWeight(2.7f);
        line.setNetWeightUom("KGM");
        line.setNetAmount(2480f);
        line.setNetAmountCurrency("EUR");
        line.setCountry("DE");
        line.setDescription("NY cou =OK ADDFEM WITH FEF POCO");
        doc.getLines().add(line);
        CusdecBundle bundle = new CusdecBundle();
        bundle.getDocuments().add(doc);
        writer.write("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n");
        marshall.marshal(bundle, writer);
        assertEquals(IOUtils.toString(new FileInputStream("src/test/data/cusdec1.xml")), writer.toString());
    }

    @Test
    public void testUnmarshall() throws JAXBException {
        CusdecBundle bundle = (CusdecBundle) unmarshall.unmarshal(new File("src/test/data/cusdec1.xml"));
        assertNotNull(bundle);
        assertFalse(bundle.getDocuments().isEmpty());
        CusdecDocument doc = bundle.getDocuments().get(0);
        assertNotNull(doc);
        assertEquals(doc.getName(), "914");
        assertEquals(doc.getTotalNetAmount(), (Double)2480.0d);
    }

    @Before
    public void setUp () throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CusdecBundle.class);
        marshall = context.createMarshaller();
        marshall.setProperty(Marshaller.JAXB_ENCODING, "iso-8859-1");
        marshall.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        unmarshall = context.createUnmarshaller();
    }
}
