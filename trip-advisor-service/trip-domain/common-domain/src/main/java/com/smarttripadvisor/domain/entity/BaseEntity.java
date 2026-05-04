package com.smarttripadvisor.domain.entity;

import java.util.Objects;

public abstract class BaseEntity<ID> {

    private ID id;

    protected BaseEntity() {
    }

    protected BaseEntity(final ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    protected void setId(final ID id) {
        this.id = id;
    }

    @Override
    public final boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof BaseEntity<?> other)) {
            return false;
        }

        return id != null && Objects.equals(id, other.id);
    }

    @Override
    public final int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
