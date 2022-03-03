package com.techvg.aquigen.domain.enumeration;

/**
 * The AccessLevel enumeration.
 */
public enum AccessLevel {
    ADMIN("Admin"),
    USER("User");

    private final String value;

    AccessLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
