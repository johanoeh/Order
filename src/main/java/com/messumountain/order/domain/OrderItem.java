package com.messumountain.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A OrderItem.
 */
@Entity
@Table(name = "order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "procuct_name")
    private String procuctName;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "price")
    private String price;

    @ManyToOne
    @JsonIgnoreProperties(value = "orderItems", allowSetters = true)
    private CustomerOrder customerOrder;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcuctName() {
        return procuctName;
    }

    public OrderItem procuctName(String procuctName) {
        this.procuctName = procuctName;
        return this;
    }

    public void setProcuctName(String procuctName) {
        this.procuctName = procuctName;
    }

    public String getProductId() {
        return productId;
    }

    public OrderItem productId(String productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public OrderItem amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public OrderItem price(String price) {
        this.price = price;
        return this;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public OrderItem customerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
        return this;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrderItem)) {
            return false;
        }
        return id != null && id.equals(((OrderItem) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OrderItem{" +
            "id=" + getId() +
            ", procuctName='" + getProcuctName() + "'" +
            ", productId='" + getProductId() + "'" +
            ", amount=" + getAmount() +
            ", price='" + getPrice() + "'" +
            "}";
    }
}
