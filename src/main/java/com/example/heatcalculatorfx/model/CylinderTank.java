package com.example.heatcalculatorfx.model;

import com.example.heatcalculatorfx.property.Property;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Repräsentiert einen zylindrischen Tank, der für Energiespeicherberechnungen verwendet wird.
 * Beinhaltet Attribute wie Radius und Höhe.
 *
 * @author Lucas
 * @version 1.0
 * @since 2024-09-05
 */
public class CylinderTank extends GeneralTank implements InterfaceTank {
    private Double radius;
    private Double height;

    public CylinderTank(String name, Double radius, Double height, Double targetTemperature, Double dailyEnergyRequirement, double v) {
        super(name, targetTemperature, dailyEnergyRequirement);
        this.radius = radius;
        this.height = height;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double calculateVolumeInLiters() {
        return radius * radius * Math.PI * height * 1000; // Volumen in Litern
    }

    @Override
    public String getTitle() {
        return "Cylinder Tank";
    }

    @Override
    public List<Property> getProperties() {
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("Temperature", String.valueOf(getTargetTemperature())));
        properties.add(new Property("Name", getName()));
        properties.add(new Property("Fassungsvermögen", String.valueOf(calculateVolumeInLiters())));
        properties.add(new Property("Tägliche Energie", String.valueOf(getDailyEnergyRequirement()))); // Accessing from superclass
        properties.add(new Property("Heiztage", String.valueOf(calculateHeatingDays())));
        properties.add(new Property("Gespeicherte Energie", String.valueOf(calculateStoredEnergy())));
        return properties;
    }
}
