package com.example.heatcalculatorfx.model;

import com.example.heatcalculatorfx.property.Property;
import java.util.List;

/**
 * Interface for tanks that have properties like a title and a list of Property objects.
 */
public interface InterfaceTank {
    String getTitle();
    List<Property> getProperties();
}
