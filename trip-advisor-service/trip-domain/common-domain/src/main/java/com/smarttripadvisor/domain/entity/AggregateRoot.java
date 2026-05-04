package com.smarttripadvisor.domain.entity;

public abstract class AggregateRoot<ID> extends BaseEntity<ID> {

    protected AggregateRoot() {
    }

    protected AggregateRoot(final ID id) {
        super(id);
    }
}
