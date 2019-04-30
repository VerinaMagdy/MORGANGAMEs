/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import javafx.application.Application;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class JavaApplication16 extends Application{
@Override
public void start(Stage PrimaryStage)
{
    Circle c1=new Circle(0,0,15);
    c1.setFill(Color.RED);
   Circle c2=new Circle(16,0,15);
    c2.setFill(Color.RED);
    Circle c3=new Circle(32,0,15);
    c3.setFill(Color.RED);
    Rectangle r=new Rectangle(100,20,100,50);
    r.setFill(Color.BLUE);
    r.setStroke(Color.BLACK);
    r.setArcHeight(5);
    r.setArcWidth(5);
    Text t=new Text("1233");
    
    HBox h=new HBox();
    h.getChildren().addAll(c1,c2,c3,new Label("SCORE"),r,t);
   
    h.setSpacing(5);
    h.setStyle("-fx-padding:4.5;"+"-fx-border-width:2;");
    Scene sc=new Scene(h,200,200);
    Stage st=new Stage();
    st.setScene(sc);
    PrimaryStage.setTitle("MORGAN");
    PrimaryStage.show();
    
    Stage m=new Stage();
    PrimaryStage.setScene(sc);
    PrimaryStage.show();
    }

    
//    Removeclass class implements EventHandler<ActionEvent>(){
//    @Override
//    public void handle(ActionEvent e){
//    
//    }
//    }
    
    public static void main(String[] args) 
    {
    launch(args);
    }
    
}
