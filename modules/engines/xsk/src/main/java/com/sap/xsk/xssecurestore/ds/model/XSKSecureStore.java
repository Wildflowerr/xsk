package com.sap.xsk.xssecurestore.ds.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="XSK_SECURE_STORE_LIST")
public class XSKSecureStore {

    @Id
    @Column(name = "LOCATION", columnDefinition = "VARCHAR", nullable = false, length = 255)
    private String location;

    @Column(name = "IS_ACTIVE", columnDefinition = "BOOLEAN", nullable = false)
    private boolean isActive;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XSKSecureStore that = (XSKSecureStore) o;
        return isActive == that.isActive &&
                location.equals(that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, isActive);
    }
}