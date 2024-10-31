package com.example.heatcalculatorfx;
import com.example.heatcalculatorfx.model.CylinderTank;
import com.example.heatcalculatorfx.model.GeneralTank;
import com.example.heatcalculatorfx.model.SquareTank;
import com.example.heatcalculatorfx.view.ControllerViewInterface;
import com.example.heatcalculatorfx.view.HeatCalculatorView;
import controller.HeatCalculatorController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class HeatCalculator extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Erstellen und Konfigurieren der Tanks
        CylinderTank cylinderTank = new CylinderTank("Zylindrischer Tank", 1.5, 60.0, 10.0, 10.0, 10.0);
        SquareTank squareTank = new SquareTank("Quadratischer Tank", 1.5, 60.0, 10.0, 2.0);



        List<GeneralTank> tanks = new ArrayList<>();
        tanks.add(cylinderTank);
        tanks.add(squareTank);

        // Controller und View initialisieren
        HeatCalculatorController controller = new HeatCalculatorController(tanks);
        ControllerViewInterface view = (ControllerViewInterface) new HeatCalculatorView(primaryStage, controller);

        // Die View an den Controller übergeben und die erste Ansicht starten
        controller.setView(view);
        controller.startView();
    }
}
