package application;
	
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	//Text t1;
	//Text t2;
	//int z=0;
	 //Boolean check=false;
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		HBox box1 = new HBox();
		HBox box2 = new HBox();
	
		Text t1 = new Text("A Zombie with a health of ");
		t1.setTranslateX(50);
		Label l1 = new Label("100");
		l1.setTranslateX(100);
		//l1.setAccessibleText("");
		Label l2 = new Label("20");
		l2.setTranslateX(200);
		Label l3 = new Label("");
		//l2.setOnInputMethodTextChanged(null);
		Text t2 = new Text("Attacked by a hero with an attack damage of");
		t2.setTranslateX(100);
		box2.getChildren().addAll(l1,l2);
		
		Button b1 = new Button("Calculate");
		b1.setMinSize(50, 200);
		b1.setTranslateX(200);
		box1.getChildren().addAll(t1,t2,b1);
		root.getChildren().addAll(box1,box2,l3);
		b1.setOnAction(e ->{		
			int x = (Integer.parseInt(l1.getText()) - Integer.parseInt(l2.getText()))/Integer.parseInt(l2.getText());
			l3.setText("Needs to be attacked "+x);
			
		});
		Scene scene= new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
		/*GridPane gridPane = new GridPane();
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");

		gridPane.add(button1, 0, 0); // column=0, row=0
		gridPane.add(button2, 1, 0); // column=1, row=0
		gridPane.add(button3, 0,1);
		gridPane.add(button4, 1,2);
		Scene scene=new Scene(gridPane,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}*/
		/*GridPane root = new GridPane();
		ArrayList<Button> btns = new ArrayList<Button>(9);
		for(int i=0;i<9;i++) {
			Button btn = new Button();
			btn.setMinSize(133, 133);
			btns.add(btn);
			btn.setOnAction(e ->{
				for(int j=0;j<btns.size();j++) {
					btns.get(j).setText("");
				}
				btn.setText("player");
			});
			root.add(btn, i%3, i/3);
		}
		int x = ((int)(Math.random() * 9));
		btns.get(x).setText("player");
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();*/
		/*Button smallButton = new Button("Small Button");
        Button enlargeButton = new Button("Enlarge");

        smallButton.setPrefWidth(100);
        smallButton.setPrefHeight(50);

        enlargeButton.setOnAction(event -> {
            double currentWidth = smallButton.getPrefWidth();
            double currentHeight = smallButton.getPrefHeight();

            smallButton.setPrefWidth(currentWidth * 1.2);
            smallButton.setPrefHeight(currentHeight * 1.2);
        });

        BorderPane root = new BorderPane();
        root.setBottom(enlargeButton);
        root.setCenter(smallButton);

        Scene scene = new Scene(root, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();*/
    
		/*Random rand  = new Random();
		VBox root = new VBox();
		Scene scene= new Scene(root,400,400);
		Label label = new Label("The Zombie has a health of 7, roll two dice to attack it!");
		label.setTranslateX(50);
		HBox box1 = new HBox(300);
		
		t1=new Text("");
		
		t2 = new Text("");
		
		box1.getChildren().addAll(t1,t2);
			
		HBox box2 = new HBox();
		
		Button btn1 = new Button("Roll Die 1");
		btn1.setMinSize(200, 100);
		btn1.setTranslateY(200);
		
		Button btn2 = new Button("Roll Die 2");
		btn2.setMinSize(200, 100);
		btn2.setTranslateY(200);
		
		box2.getChildren().addAll(btn1,btn2);
		
		
		
		btn1.setOnAction(e ->{
			if(check==false) {
			 
				t1.setText((rand.nextInt(6)+1)+"");
			 check=true;
			}
			else
			{
				t1.setText((rand.nextInt(6)+1)+"");
				 z=(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()));
				 if(z<7) {
					 label.setText("Your total attack was "+z+"!  you havn't slain the zombie");
				 }
					 else {
						 label.setText("Your total attack was "+z+" you have slain the zombie");
					 }
				 check=false;
			}
		});
		
		btn2.setOnAction(e ->{
			if(check==false) {
				 
				 t2.setText((rand.nextInt(6)+1)+"");
				 check=true;
				}
				else
				{
					t2.setText((rand.nextInt(6)+1)+"");
					 z=(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()));
					 if(z<7) {
						 label.setText("Your total attack was "+z+" you havn't slain the zombie");
					 }
						 else {
							 label.setText("Your total attack was "+z+" you have slain the zombie");
						 }
					 check=false;
				}
			});
		root.getChildren().addAll(label,box1,box2);
		primaryStage.setScene(scene);
		primaryStage.show();*/
		
		
	
	public static void main(String[] args) {
		launch(args);
	}
}
