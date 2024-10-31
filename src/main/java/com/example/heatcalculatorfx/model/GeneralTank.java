package com.example.heatcalculatorfx.model;

import com.example.heatcalculatorfx.property.Property;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Repräsentiert einen allgemeinen Tank für Energiespeicherberechnungen.
 * Beinhaltet Attribute wie Zieltemperatur und täglichen Energiebedarf.
 *
 * @author Lucas
 * @version 1.0
 * @since 2024-09-05
 */
public abstract class GeneralTank implements InterfaceTank {
    /**
     * Name des Tanks.
     */
    private String name;

    /**
     * Zieltemperatur des Tanks in Grad Celsius.
     */
    private Double targetTemperature;

    /**
     * Täglicher Energiebedarf des Tanks in kWh.
     */
    private Double dailyEnergyRequirement;

    /**
     * Konstruktor für den allgemeinen Tank.
     *
     * @param name                   der Name des Tanks
     * @param targetTemperature      die Zieltemperatur des Tanks
     * @param dailyEnergyRequirement der tägliche Energiebedarf des Tanks
     */
    public GeneralTank(String name, Double targetTemperature, Double dailyEnergyRequirement) {
        this.name = name;
        this.targetTemperature = targetTemperature;
        this.dailyEnergyRequirement = dailyEnergyRequirement;
    }

    public String getName() {
        return name;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        if (targetTemperature <= 0 || targetTemperature > 30) {
            throw new IllegalArgumentException("Die Zieltemperatur muss zwischen 0 und 30 Grad Celsius liegen.");
        }
        this.targetTemperature = targetTemperature;
    }

    public Double getDailyEnergyRequirement() {
        return dailyEnergyRequirement;
    }

    public void setDailyEnergyRequirement(Double dailyEnergyRequirement) {
        this.dailyEnergyRequirement = dailyEnergyRequirement;
    }

    /**
     * Berechnet die gespeicherte Energie basierend auf dem täglichen Energiebedarf.
     *
     * @return die insgesamt gespeicherte Energie über 31 Tage
     */
    public Double calculateStoredEnergy() {
        return dailyEnergyRequirement * 31;
    }

    /**
     * Berechnet die Anzahl der Heiztage für den Tank.
     *
     * @return die Anzahl der Heiztage, die konstant 31 Tage beträgt
     */
    public Double calculateHeatingDays() {
        return 31.0;
    }

    /**
     * Abstrakte Methode zur Berechnung des Volumens des Tanks in Litern.
     *
     * @return das Volumen des Tanks in Litern
     */
    public abstract Double calculateVolumeInLiters();

    @Override
    public String toString() {
        return "Tankname: " + getName() + "\n" +
                "Volumen: " + calculateVolumeInLiters() + "\n" +
                "Gespeicherte Energie: " + calculateStoredEnergy() + "\n" +
                "Heiztage: " + calculateHeatingDays() + "\n" +
                "Temperatur: " + getTargetTemperature() + "\n" +
                "Täglicher Energiebedarf: " + getDailyEnergyRequirement();
    }



}