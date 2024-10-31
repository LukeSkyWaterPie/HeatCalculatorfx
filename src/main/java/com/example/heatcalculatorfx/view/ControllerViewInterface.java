package com.example.heatcalculatorfx.view;


import com.example.heatcalculatorfx.model.InterfaceTank;

/**
 * Interface representing the view component in the MVC architecture,
 * enabling dependency injection.
 */
public interface ControllerViewInterface {
    /**
     * Starts the view with the specified tank data.
     *
     * @param data the tank data to display
     */
    void startView(InterfaceTank data);
}
