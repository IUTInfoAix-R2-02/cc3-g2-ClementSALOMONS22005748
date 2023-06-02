package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    TextField TF1;
    @FXML
    TextField TF2;
    @FXML
    TextField TF3;
    @FXML
    TextField TF4;
    @FXML
    TextField TF5;
    @FXML
    TextField TF6;

    @FXML
    Label err1;
    @FXML
    Label err2;

    @FXML
    Pane scene;

    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Circle circle3 = new Circle();
    Circle circle4 = new Circle();
    Circle circle5 = new Circle();
    Circle circle6 = new Circle();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

// Dessiner un point
    private void Dessiner(int val, int comp) {
        err1.setVisible(false);
        err2.setVisible(false);
        int x = getXRadarChart(val,comp);
        int y = getYRadarChart(val,comp);

        if (comp == 1) {
            scene.getChildren().remove(circle1);
            circle1.setVisible(true);
            circle1.setCenterX(x);
            circle1.setCenterY(y);
            circle1.setRadius(7);
            scene.getChildren().add(circle1);
        }
        if (comp == 2) {
            scene.getChildren().remove(circle2);
            circle2.setVisible(true);
            circle2.setCenterX(x);
            circle2.setCenterY(y);
            circle2.setRadius(7);
            scene.getChildren().add(circle2);
        }
        if (comp == 3) {
            scene.getChildren().remove(circle3);
            circle3.setVisible(true);
            circle3.setCenterX(x);
            circle3.setCenterY(y);
            circle3.setRadius(7);
            scene.getChildren().add(circle3);
        }
        if (comp == 4) {
            scene.getChildren().remove(circle4);
            circle4.setVisible(true);
            circle4.setCenterX(x);
            circle4.setCenterY(y);
            circle4.setRadius(7);
            scene.getChildren().add(circle4);
        }
        if (comp == 5) {
            scene.getChildren().remove(circle5);
            circle5.setVisible(true);
            circle5.setCenterX(x);
            circle5.setCenterY(y);
            circle5.setRadius(7);
            scene.getChildren().add(circle5);
        }
        if (comp == 6) {
            scene.getChildren().remove(circle6);
            circle6.setVisible(true);
            circle6.setCenterX(x);
            circle6.setCenterY(y);
            circle6.setRadius(7);
            scene.getChildren().add(circle6);
        }
    }


// Tracer et Vider
    @FXML
    private void tracerClicked() {
    }
    @FXML
    private void viderClicked() {
        err1.setVisible(false);
        err2.setVisible(false);
        circle1.setVisible(false);
        circle2.setVisible(false);
        circle3.setVisible(false);
        circle4.setVisible(false);
        circle5.setVisible(false);
        circle6.setVisible(false);
    }


// Get le contenu des Text Field (TF)
    @FXML
    private void get1() {
        int val = 0;
        if (TF1.getText().length()>0) {
            val = Integer. valueOf(TF1.getText());
        }
        if (val >= 0 && val <= 20) {
            Dessiner(val,1);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }
    @FXML
    private void get2() {
        int val = 0;
        if (TF2.getText().length()>0) {
            val = Integer. valueOf(TF2.getText());
        }
        if (val >= 0 && val <= 20) {
            Dessiner(val,2);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }
    @FXML
    private void get3() {
        int val = 0;
        if (TF3.getText().length()>0) {
            val = Integer. valueOf(TF3.getText());
        }
        if (val >= 0 && val <= 20) {
            Dessiner(val,3);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }
    @FXML
    private void get4() {
        int val = 0;
        if (TF4.getText().length()>0) {
            val = Integer. valueOf(TF4.getText());
        }
        if (val >= 0 && val <= 20) {
            Dessiner(val,4);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }
    @FXML
    private void get5() {
        int val = 0;
        if (TF5.getText().length()>0) {
            val = Integer. valueOf(TF5.getText());
        }
        if (val >= 0 && val <= 20) {
            Dessiner(val,5);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }
    @FXML
    private void get6() {
        int val = 0;
        if (TF6.getText().length()>0) {
            val = Integer. valueOf(TF6.getText());
        }
        if (val >= 0 && val <= 20) {
            Dessiner(val,6);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }



}
