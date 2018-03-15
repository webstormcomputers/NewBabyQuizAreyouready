package com.webstormcomputers.newbabyquizareyouready;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int questionCount = 6;
    int maxCount = questionCount + 1;
    int counter = 1;
    TextView[] textViewArray = new TextView[questionCount];
    RadioGroup[] radGroupArray = new RadioGroup[questionCount];
    String id;
    String rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void invisible(View v) {

        TextView dissapear = (TextView) findViewById(R.id.openingText);
        dissapear.setVisibility(View.GONE);
        if (counter < 6) {
            int temp;
            int radTemp;
            id = "quesText";
            id = id + counter ;
            temp = getResources().getIdentifier(id,"id",getPackageName());
            textViewArray[counter] = (TextView) findViewById(temp);
            rad = "quesRad" + counter;
            radTemp = getResources().getIdentifier(rad,"id", getPackageName());
            radGroupArray[counter] = (RadioGroup) findViewById(radTemp);
            Log.d("ADebugTag", "Value: " + counter);

            if (counter > 1)
            { int prev = counter - 1;
                textViewArray[prev].setVisibility(View.GONE);
                radGroupArray[prev].setVisibility(View.GONE);
            }
            textViewArray[counter].setVisibility(View.VISIBLE);
            radGroupArray[counter].setVisibility(View.VISIBLE);
            if (counter != 6) {
                counter++;
            }

        } //end if
        else { //end Calculate score and display result
            int prev = counter - 1;
            textViewArray[prev].setVisibility(View.GONE);
            radGroupArray[prev].setVisibility(View.GONE);
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("You finished the quiz");
            result.setVisibility(View.VISIBLE);
            Button button = (Button) findViewById(R.id.Next);
            button.setVisibility(View.GONE);
        }
        }//end invisible

}
