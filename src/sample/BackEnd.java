package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.animation.AnimationTimer;
public class BackEnd
{
    private int clicked = 0;
    public Button button;
    public Button button2;
    private boolean start = false;
    public Label score;
    private boolean counting = true;
    public void Click()
    {
        if(counting = true) {
            System.out.println("a");
            button.setText("You have clicked " + String.valueOf(clicked) + " time(s) in 10 seconds");
            clicked++;
        }
        else return;
    }
    public void firstClick(ActionEvent e) {
        button.setVisible(true);
        button2.setVisible(false);

        if (!start) {
            long step = System.nanoTime() + 10000000000L;
            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    if (now > step) {
                        counting = false;
                    }
                }
            }.start();
        }
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

