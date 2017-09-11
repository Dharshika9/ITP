/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;


public class Finalizedordersmodel {
    
    
    private int orderno;
    private int productcode;
    private double qtyorderd;
    private String prounitmeasure;
    private int fabriccode;
    private double fabricqty;
    private String fabunitmeasure;
    //private DateTime receiveddate;
    //private DateTime deliverydate;
    private String status;
    
    
    
    
    public Finalizedordersmodel(  int Orderno,
    int Productcode,
     double Qtyorderd,
     String Prounitmeasure,
     int Fabriccode,
     double Fabricqty,
     String Fabunitmeasure,
     //DateTime Receiveddate,
     //DateTime Deliverydate,
     String Status)
    {
        this.orderno=Orderno;
        this.productcode=Productcode;
        this.qtyorderd=Qtyorderd;
        this.prounitmeasure=Prounitmeasure;
        this.fabriccode=Fabriccode;
        this.fabricqty=Fabricqty;
        this.fabunitmeasure=Fabunitmeasure;
        //this.receiveddate=Receiveddate;
        //this.deliverydate=Deliverydate;
        this.status=Status;
    
    }

    /**
     * @return the orderno
     */
    public int getOrderno() {
        return orderno;
    }

    /**
     * @param orderno the orderno to set
     */
    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    /**
     * @return the productcode
     */
    public int getProductcode() {
        return productcode;
    }

    /**
     * @param productcode the productcode to set
     */
    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    /**
     * @return the qtyorderd
     */
    public double getQtyorderd() {
        return qtyorderd;
    }

    /**
     * @param qtyorderd the qtyorderd to set
     */
    public void setQtyorderd(double qtyorderd) {
        this.qtyorderd = qtyorderd;
    }

    /**
     * @return the prounitmeasure
     */
    public String getProunitmeasure() {
        return prounitmeasure;
    }

    /**
     * @param prounitmeasure the prounitmeasure to set
     */
    public void setProunitmeasure(String prounitmeasure) {
        this.prounitmeasure = prounitmeasure;
    }

    /**
     * @return the fabriccode
     */
    public int getFabriccode() {
        return fabriccode;
    }

    /**
     * @param fabriccode the fabriccode to set
     */
    public void setFabriccode(int fabriccode) {
        this.fabriccode = fabriccode;
    }

    /**
     * @return the fabricqty
     */
    public double getFabricqty() {
        return fabricqty;
    }

    /**
     * @param fabricqty the fabricqty to set
     */
    public void setFabricqty(double fabricqty) {
        this.fabricqty = fabricqty;
    }

    /**
     * @return the fabunitmeasure
     */
    public String getFabunitmeasure() {
        return fabunitmeasure;
    }

    /**
     * @param fabunitmeasure the fabunitmeasure to set
     */
    public void setFabunitmeasure(String fabunitmeasure) {
        this.fabunitmeasure = fabunitmeasure;
    }

    /**
     * @return the receiveddate
     */
    //public DateTime getReceiveddate() {
    //    return receiveddate;
    //}

    /**
     * @param receiveddate the receiveddate to set
     */
    //public void setReceiveddate(DateTime receiveddate) {
    //    this.receiveddate = receiveddate;
    //}

    /**
     * @return the deliverydate
     */
    //public DateTime getDeliverydate() {
    //    return deliverydate;
    //}

    /**
     * @param deliverydate the deliverydate to set
     */
    //public void setDeliverydate(DateTime deliverydate) {
    //    this.deliverydate = deliverydate;
    //}

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
