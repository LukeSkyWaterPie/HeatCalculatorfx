package com.example.heatcalculatorfx.property;

/**
 * Repräsentiert eine Eigenschaft eines Tanks, die einen Schlüssel und einen Wert hat.
 */
public class Property {
    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
