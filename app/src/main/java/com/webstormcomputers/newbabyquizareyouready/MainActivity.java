package com.webstormcomputers.newbabyquizareyouready;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int questionCount = 5;
    int counter = 1;
    TextView[] textViewArray = new TextView[questionCount];
    RadioGroup[] radGroupArray = new RadioGroup[questionCount];
    private String[] id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void invisible(View v) {

        TextView dissapear = (TextView) findViewById(R.id.openingText);
        dissapear.setVisibility(View.GONE);
        if (counter < questionCount) {
            int temp;
            id = new String[]{"quesText" + counter};
            temp = getResources().getIdentifier(id, "id", getPackageName());
            textViewArray[counter] = (TextView) findViewById(temp);

            if (counter < 1)
            { int prev = counter - 1;
                textViewArray[prev].setVisibility(View.GONE);
                //radGroupArray[prev].setVisibility(View.GONE);
            }
            textViewArray[counter].setVisibility(View.VISIBLE);
            //radGroupArray[counter].setVisibility(View.VISIBLE);
            counter++;

        } //end if
        else { //end Calculate score and display result

        }
        }//end invisible

}
