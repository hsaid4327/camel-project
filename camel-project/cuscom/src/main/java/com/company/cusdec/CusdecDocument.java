package com.company.cusdec;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CUSDEC")
public class CusdecDocument {
    @XmlElement(name="DOCUMENT_NAME")
    protected String name;
    @XmlElement(name="DOCUMENT_ID")
    protected String id;
    @XmlElement(name="TOT_NET_WEIGHT")
    protected Float totalNetWeight;
    @XmlElement(name="TOT_NET_WEIGHT_UOM")
    protected String totalNetWeightUom;
    @XmlElement(name="TRANS_DOC_NUM_AWB")
    protected String airWaybill;
    @XmlElement(name="TRANS_DOC_NUM_HWB")
    protected String houseAirWaybill;
    @XmlElement(name="CARRIER_CODE")
    protected String carrierCode;
    @XmlElement(name="TOTAL_NET_AMOUNT")
    protected Double totalNetAmount;
    @XmlElement(name="TOTAL_NET_AMOUNT_CUR")
    protected String totalNetAmountCurrency;
    @XmlElementWrapper(name = "LINES")
    @XmlElement(name = "LINE")
    protected ArrayList<CusdecLine> lines = new ArrayList<CusdecLine>();

    public ArrayList<CusdecLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<CusdecLine> lines) {
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getTotalNetWeight() {
        return totalNetWeight;
    }

    public void setTotalNetWeight(Float totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    public String getTotalNetWeightUom() {
        return totalNetWeightUom;
    }

    public void setTotalNetWeightUom(String totalNetWeightUom) {
        this.totalNetWeightUom = totalNetWeightUom;
    }

    public String getAirWaybill() {
        return airWaybill;
    }

    public void setAirWaybill(String airWaybill) {
        this.airWaybill = airWaybill;
    }

    public String getHouseAirWaybill() {
        return houseAirWaybill;
    }

    public void setHouseAirWaybill(String houseAirWaybill) {
        this.houseAirWaybill = houseAirWaybill;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public Double getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(Double totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }

    public String getTotalNetAmountCurrency() {
        return totalNetAmountCurrency;
    }

    public void setTotalNetAmountCurrency(String totalNetAmountCurrency) {
        this.totalNetAmountCurrency = totalNetAmountCurrency;
    }
}
