package com.messumountain.order.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A CustomerOrder.
 */
@Entity
@Table(name = "customer_order")
public class CustomerOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "customer_number")
    private String customerNumber;

    @Column(name = "legal_id")
    private String legalId;

    @OneToMany(mappedBy = "customerOrder")
    private Set<OrderItem> orderItems = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public CustomerOrder orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public CustomerOrder orderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public CustomerOrder customerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getLegalId() {
        return legalId;
    }

    public CustomerOrder legalId(String legalId) {
        this.legalId = legalId;
        return this;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public CustomerOrder orderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    public CustomerOrder addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        orderItem.setCustomerOrder(this);
        return this;
    }

    public CustomerOrder removeOrderItem(OrderItem orderItem) {
        this.orderItems.remove(orderItem);
        orderItem.setCustomerOrder(null);
        return this;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerOrder)) {
            return false;
        }
        return id != null && id.equals(((CustomerOrder) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CustomerOrder{" +
            "id=" + getId() +
            ", orderNumber='" + getOrderNumber() + "'" +
            ", orderStatus='" + getOrderStatus() + "'" +
            ", customerNumber='" + getCustomerNumber() + "'" +
            ", legalId='" + getLegalId() + "'" +
            "}";
    }
}
