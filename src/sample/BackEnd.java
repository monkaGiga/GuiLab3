package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BackEnd
{
    private int clicked = 0;
    public Button button;

    public void Click()
    {
        System.out.println("a");
        button.setText("You have clicked " + String.valueOf(clicked) + " time(s)");
        clicked++;
    }


    /*public int timer()
    {
        double timer=(double)(System.nanoTime() - time)/(100000000);
        if(timer==10.0) {
            return -1;
        }
        return 0;
    }*/

}

