package com.company.cusdec;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name="BUNDLE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BUNDLE")
public class CusdecBundle {
    @XmlElement(name="CUSDEC")
    protected ArrayList<CusdecDocument> documents = new ArrayList<CusdecDocument>();

    public ArrayList<CusdecDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<CusdecDocument> documents) {
        this.documents = documents;
    }
}
