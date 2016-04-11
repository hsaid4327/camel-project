package com.company.cusdec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Currency;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINE")
public class CusdecLine {
    @XmlElement(name="LINE_NUMBER")
    protected String number;
    @XmlElement(name="PRODUCT_NUMBER")
    protected String productNumber;
    @XmlElement(name="LIN_QTY")
    protected int quantity;
    @XmlElement(name="LIN_QTY_UOM")
    protected String quantityUom;
    @XmlElement(name="LIN_NET_WEIGHT")
    protected Float netWeight;
    @XmlElement(name="LIN_NET_WEIGHT_UOM")
    protected String netWeightUom;
    @XmlElement(name="LIN_ITEM_NET_AMOUNT")
    protected Float netAmount;
    @XmlElement(name="LIN_ITEM_NET_AMOUNT_CUR")
    protected String netAmountCurrency;
    @XmlElement(name="COUNTRY_ORIGIN_CODE")
    protected String country;
    @XmlElement(name="DESCRIPTION")
    protected String description;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUom() {
        return quantityUom;
    }

    public void setQuantityUom(String quantityUom) {
        this.quantityUom = quantityUom;
    }

    public Float getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Float netWeight) {
        this.netWeight = netWeight;
    }

    public String getNetWeightUom() {
        return netWeightUom;
    }

    public void setNetWeightUom(String netWeightUom) {
        this.netWeightUom = netWeightUom;
    }

    public Float getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Float netAmount) {
        this.netAmount = netAmount;
    }

    public String getNetAmountCurrency() {
        return netAmountCurrency;
    }

    public void setNetAmountCurrency(String netAmountCurrency) {
        this.netAmountCurrency = netAmountCurrency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
