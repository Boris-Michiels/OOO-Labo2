package ui;

import domain.CaesarCoding;
import domain.CodingContext;
import domain.MirrorCoding;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class CodingUi extends Application {
    CodingContext codingContext;

    public CodingUi() {
        this.codingContext = new CodingContext();
    }

    public CodingContext getCodingContext() {
        return codingContext;
    }

    public void setCodingContext(CodingContext codingContext) {
        this.codingContext = codingContext;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Coding Application");

        BorderPane root = new BorderPane();
        GridPane gridPane = new GridPane();

        Label textLabel = new Label("Text to encrypt/decrypt: ");
        TextField textInput = new TextField();
        gridPane.add(textLabel, 0, 0);
        gridPane.add(textInput, 1, 0);

        TextField textOutput = new TextField();
        textOutput.setEditable(false);
        gridPane.add(textOutput, 1, 1);

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll(
                "Caesar",
                "Mirror"
        );
        gridPane.add(comboBox, 1, 2);

        Button encode = new Button("Encode");
        Button decode = new Button("Decode");
        encode.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String codingStrategy = comboBox.getValue().toString();
                switch (codingStrategy) {
                    case "Caesar":
                        codingContext.setCodingStrategy(new CaesarCoding());
                        break;
                    case "Mirror":
                        codingContext.setCodingStrategy(new MirrorCoding());
                        break;
                }
                getCodingContext().setText(textInput.getText());
                textOutput.setText(getCodingContext().encode());
            }
        });
        gridPane.add(encode, 1, 3);
        gridPane.add(decode, 2, 3);

        root.setCenter(gridPane);

        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.show();
    }
}
