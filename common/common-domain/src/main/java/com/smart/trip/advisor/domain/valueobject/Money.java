package com.smart.trip.advisor.domain.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class Money {

    private static final int SCALE = 2;

    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = normalize(Objects.requireNonNull(amount, "amount must not be null"));
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero() {
        return amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        Objects.requireNonNull(money, "money must not be null");
        return amount.compareTo(money.amount) > 0;
    }

    public Money add(Money money) {
        Objects.requireNonNull(money, "money must not be null");
        return new Money(amount.add(money.amount));
    }

    public Money subtract(Money money) {
        Objects.requireNonNull(money, "money must not be null");
        return new Money(amount.subtract(money.amount));
    }

    public Money multiply(int multiplier) {
        return new Money(amount.multiply(BigDecimal.valueOf(multiplier)));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Money money)) {
            return false;
        }
        return amount.compareTo(money.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    private static BigDecimal normalize(BigDecimal amount) {
        return amount.setScale(SCALE, RoundingMode.HALF_EVEN);
    }
}
