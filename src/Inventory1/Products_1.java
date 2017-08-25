/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dharshika
 */
@Entity
@Table(name = "products", catalog = "ITP", schema = "")
@NamedQueries({
    @NamedQuery(name = "Products_1.findAll", query = "SELECT p FROM Products_1 p"),
    @NamedQuery(name = "Products_1.findByProductCode", query = "SELECT p FROM Products_1 p WHERE p.productCode = :productCode"),
    @NamedQuery(name = "Products_1.findByProductCategory", query = "SELECT p FROM Products_1 p WHERE p.productCategory = :productCategory"),
    @NamedQuery(name = "Products_1.findByProductSubcategory", query = "SELECT p FROM Products_1 p WHERE p.productSubcategory = :productSubcategory"),
    @NamedQuery(name = "Products_1.findBySize", query = "SELECT p FROM Products_1 p WHERE p.size = :size"),
    @NamedQuery(name = "Products_1.findByColor", query = "SELECT p FROM Products_1 p WHERE p.color = :color"),
    @NamedQuery(name = "Products_1.findByUnitsOfMeasure", query = "SELECT p FROM Products_1 p WHERE p.unitsOfMeasure = :unitsOfMeasure"),
    @NamedQuery(name = "Products_1.findByCostPerUnit", query = "SELECT p FROM Products_1 p WHERE p.costPerUnit = :costPerUnit")})
public class Products_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_code")
    private Integer productCode;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "product_subcategory")
    private String productSubcategory;
    @Column(name = "size")
    private String size;
    @Column(name = "color")
    private String color;
    @Column(name = "units_of_measure")
    private String unitsOfMeasure;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cost_per_unit")
    private Double costPerUnit;

    public Products_1() {
    }

    public Products_1(Integer productCode) {
        this.productCode = productCode;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        Integer oldProductCode = this.productCode;
        this.productCode = productCode;
        changeSupport.firePropertyChange("productCode", oldProductCode, productCode);
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        String oldProductCategory = this.productCategory;
        this.productCategory = productCategory;
        changeSupport.firePropertyChange("productCategory", oldProductCategory, productCategory);
    }

    public String getProductSubcategory() {
        return productSubcategory;
    }

    public void setProductSubcategory(String productSubcategory) {
        String oldProductSubcategory = this.productSubcategory;
        this.productSubcategory = productSubcategory;
        changeSupport.firePropertyChange("productSubcategory", oldProductSubcategory, productSubcategory);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        String oldSize = this.size;
        this.size = size;
        changeSupport.firePropertyChange("size", oldSize, size);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String oldColor = this.color;
        this.color = color;
        changeSupport.firePropertyChange("color", oldColor, color);
    }

    public String getUnitsOfMeasure() {
        return unitsOfMeasure;
    }

    public void setUnitsOfMeasure(String unitsOfMeasure) {
        String oldUnitsOfMeasure = this.unitsOfMeasure;
        this.unitsOfMeasure = unitsOfMeasure;
        changeSupport.firePropertyChange("unitsOfMeasure", oldUnitsOfMeasure, unitsOfMeasure);
    }

    public Double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(Double costPerUnit) {
        Double oldCostPerUnit = this.costPerUnit;
        this.costPerUnit = costPerUnit;
        changeSupport.firePropertyChange("costPerUnit", oldCostPerUnit, costPerUnit);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCode != null ? productCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products_1)) {
            return false;
        }
        Products_1 other = (Products_1) object;
        if ((this.productCode == null && other.productCode != null) || (this.productCode != null && !this.productCode.equals(other.productCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory1.Products_1[ productCode=" + productCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
