package controller;

import com.example.heatcalculatorfx.model.GeneralTank;
import com.example.heatcalculatorfx.model.InterfaceTank;
import com.example.heatcalculatorfx.view.ControllerViewInterface;
import com.example.heatcalculatorfx.view.HeatCalculatorView;
import javafx.event.ActionEvent;

import java.util.List;

public class HeatCalculatorController implements javafx.event.EventHandler<ActionEvent> {

    protected List<GeneralTank> models;
    protected ControllerViewInterface view;
    protected int currentModel = 0;

    public HeatCalculatorController(List<GeneralTank> models) {
        this.models = models;
    }

    // Getter and Setter for models
    public List<GeneralTank> getModels() {
        return models;
    }

    public void setModels(List<GeneralTank> models) {
        this.models = models;
    }

    // Getter and Setter for view
    public ControllerViewInterface getView() {
        return view;
    }

    public void setView(ControllerViewInterface view) {
        this.view = view;
    }

    // Getter and Setter for currentModel
    public int getCurrentModel() {
        return currentModel;
    }

    public void setCurrentModel(int currentModel) {
        this.currentModel = currentModel;
    }

    public void startView() {
        view.startView((InterfaceTank) models.get(currentModel));
    }

    public void showNextLabel() {
        // Increments currentLabel unless it's the last in the list
        if (currentModel < models.size() - 1) {
            currentModel++;
        } else {
            currentModel = 0;
        }
        view.startView((InterfaceTank) models.get(currentModel));
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        showNextLabel();
    }
}
