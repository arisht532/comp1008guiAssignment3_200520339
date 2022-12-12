package MainFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class AppControls
{

    @FXML
    private ColorPicker selector;
    @FXML
    private TextField Sname;
    @FXML
    private Pane Seat1;
    @FXML
    private Pane Seat2;
    @FXML
    private Pane Seat3;
    @FXML
    private Pane Seat4;
    @FXML
    private Pane Seat5;
    @FXML
    private Pane Seat6;
    @FXML
    private Pane Seat7;
    @FXML
    private Pane Seat8;
    @FXML
    private Pane Seat9;
    @FXML
    private Text Name1;
    @FXML
    private Text Name2;
    @FXML
    private Text Name3;
    @FXML
    private Text Name4;
    @FXML
    private Text Name5;
    @FXML
    private Text Name6;
    @FXML
    private Text Name7;
    @FXML
    private Text Name8;
    @FXML
    private Text Name9;
    @FXML
    private Label Error;

    ArrayList<Integer> selectedSeat = new ArrayList<Integer>(10);

    int number_of_selected_seats = 0;

    int RandomSeatSelector(int randomnum)
    {
        while(true)
        {
            Random rand = new Random();
            int upperLimit = 9;
            int lowerLimit = 1;
            int range = upperLimit - lowerLimit + 1;
            int range2 = (int) (Math.random() * range) + lowerLimit;

            if(selectedSeat.contains(range2))
            {
                continue;
            }
            else
            {
                selectedSeat.add(range2);
                return range2;
            }
        }
    }


    @FXML
    void Assigner(ActionEvent event)
    {
        Random rand = new Random();
        int error=0;
        String name = Sname.getText();
        Color color= selector.getValue();
        if(number_of_selected_seats==9)
        {
            Error.setVisible(true);
            Error.setText("No More Seats Left! Sorry.");
        }
        int randomnum= rand.nextInt(1,10);

        int randomNum = RandomSeatSelector(randomnum);


        if(Name1.getText().compareTo(name)==0||Name2.getText().compareTo(name)==0||Name3.getText().equals(name)
                ||Name4.getText().equals(name)||Name5.getText().equals(name)||Name6.getText().equals(name)||
                Name7.getText().equals(name)||Name8.getText().equals(name)||Name9.getText().equals(name))
        {
            error=1;
            selectedSeat.remove(selectedSeat.indexOf(randomNum));
        }

        if(color.toString().equals("0xffffffff"))
            error=2;
        if(Seat1.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat2.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat3.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat4.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat5.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat6.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat7.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat8.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(Seat9.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;

        if(name.isEmpty())
        {
            error=6;
            Error.setText("Name is not  entered. Please put your name.");
            Error.setVisible(true);
            selectedSeat.remove(randomNum);
            selectedSeat.remove(selectedSeat.indexOf(randomNum));

        }
        if(error==0)
        {
            number_of_selected_seats++;
            if(randomNum==1){
                Error.setVisible(false);
                Seat1.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name1.setText(name);
                Name1.setVisible(true);

                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==2)
            {
                Error.setVisible(false);
                Seat2.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name2.setText(name);
                Name2.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==3)
            {
                Error.setVisible(false);
                Seat3.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name3.setText(name);
                Name3.setVisible(true);

                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==4)
            {
                Error.setVisible(false);
                Seat4.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name4.setText(name);
                Name4.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==5)
            {
                Error.setVisible(false);
                Seat5.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name5.setText(name);
                Name5.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==6)
            {
                Error.setVisible(false);
                Seat6.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name6.setText(name);
                Name6.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==7)
            {
                Error.setVisible(false);
                Seat7.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name7.setText(name);
                Name7.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==8)
            {
                Error.setVisible(false);
                Seat8.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name8.setText(name);
                Name8.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }

            }
            if(randomNum==9)
            {
                Error.setVisible(false);
                Seat9.setStyle("-fx-background-color: #" +color.toString().substring(2));
                Name9.setText(name);
                Name9.setVisible(true);
                if(number_of_selected_seats==9)
                {
                    Error.setVisible(true);
                    Error.setText("All Seats have been assigned now.");

                }
            }
        }

        else if(error==1)
        {
            Error.setText("Please put another name.");
            Error.setStyle("-fx-background-color: rgba(255,0,0,0.3)");
            Error.setVisible(true);
            selectedSeat.remove((Integer) randomNum);

        }
        else if(error==2)
        {
            Error.setText("Please choose any other color.");
            Error.setStyle("-fx-background-color: rgba(255,0,0,0.3)");
            Error.setVisible(true);
            selectedSeat.remove(selectedSeat.indexOf(randomNum));

        }
        else
        {
            Error.setVisible(false);
            Error.setText("No more seats left. Sorry!");
            Error.setStyle("-fx-background-color: rgba(255,0,0,0.3)");
            Error.setVisible(true);
        }
    }

    @FXML
    void initialize()
    {
        Name1.setVisible(false);
        Name3.setVisible(false);
        Name2.setVisible(false);
        Name4.setVisible(false);
        Name5.setVisible(false);
        Name6.setVisible(false);
        Name7.setVisible(false);
        Name8.setVisible(false);
        Name9.setVisible(false);
        Error.setVisible(false);
    }


}