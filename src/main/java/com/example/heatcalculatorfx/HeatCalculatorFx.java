package com.example.heatcalculatorfx;

import com.example.heatcalculatorfx.model.CylinderTank;
import com.example.heatcalculatorfx.model.GeneralTank;
import com.example.heatcalculatorfx.model.SquareTank;
import com.example.heatcalculatorfx.view.ControllerViewInterface;
import com.example.heatcalculatorfx.view.HeatCalculatorView;
import com.example.heatcalculatorfx.view.SecondHeatCalculatorView;
import controller.HeatCalculatorController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class HeatCalculatorFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        List<GeneralTank> models = createModels();
        HeatCalculatorController controller = new HeatCalculatorController(models);
        HeatCalculatorView view = new HeatCalculatorView(stage, controller);
        SecondHeatCalculatorView altView = new SecondHeatCalculatorView(stage, controller);
        controller.setView(view);
        controller.startView();
    }

    public List<GeneralTank> createModels() {
        ArrayList<GeneralTank> models = new ArrayList<>();

        // Erstellen und Hinzufügen von Tanks mit Beispielwerten
    //    models.add(new GeneralTank("General Tank", 100, 1000, 10));
        models.add(new CylinderTank("Cylindrical Tank", 1.5, 60.0, 20.0, 5.0, 10.0));
        models.add(new SquareTank("Square Tank", 2.0, 75.0, 25.0, 5.0));

        return models;
    }
}
