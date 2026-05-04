package com.smart.trip.advisor.domain.valueobject;

import java.util.Objects;

public abstract class BaseId<T> {

    private final T value;

    protected BaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof BaseId<?> baseId)) {
            return false;
        }
        return Objects.equals(value, baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
