package com.smart.trip.advisor.domain.entity;

import java.util.Objects;

public abstract class BaseEntity<ID> {

    private ID id;

    protected BaseEntity() {
    }

    protected BaseEntity(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    protected void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof BaseEntity<?> that)) {
            return false;
        }
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
