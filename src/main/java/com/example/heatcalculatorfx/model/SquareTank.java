package com.example.heatcalculatorfx.model;

import com.example.heatcalculatorfx.property.Property;
import java.util.ArrayList;
import java.util.List;

public class SquareTank extends GeneralTank implements InterfaceTank {
    private Double length;
    private Double height;

    public SquareTank(String name, Double length, Double height, Double targetTemperature, Double dailyEnergyRequirement) {
        super(name, targetTemperature, dailyEnergyRequirement);
        this.length = length;
        this.height = height;
    }
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double calculateVolumeInLiters() {
        return length * length * height * 1000;
    }

    @Override
    public String getTitle() {
        return "Square Tank";
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
