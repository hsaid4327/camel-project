package com.company;

import com.company.cusdec.CusdecBundle;
import org.apache.camel.Converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Converter
public class CusdecConverter {
    private static Unmarshaller unmarshaller;

    @Converter
    public static CusdecBundle toCusdecBundle(File cusdecFile) throws JAXBException {
        if (unmarshaller == null) {
            JAXBContext jaxb = JAXBContext.newInstance(CusdecBundle.class);
            unmarshaller = jaxb.createUnmarshaller();
        }
        CusdecBundle bundle = (CusdecBundle)unmarshaller.unmarshal(cusdecFile);
        return bundle;
    }
}
