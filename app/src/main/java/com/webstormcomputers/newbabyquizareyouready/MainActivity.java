package com.webstormcomputers.newbabyquizareyouready;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int questionCount = 5;
    int counter = 0;
    TextView[] textViewArray = new TextView[questionCount];
    RadioGroup[] radGroupArray = new RadioGroup[questionCount];
    String id;
    String rad;
    int score = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /***
     *Invisible is called to remove the opening text and setup the questions
     *
     * @param v
     */

    public void invisible(View v) {

        TextView dissapear = (TextView) findViewById(R.id.openingText);
        dissapear.setVisibility(View.GONE);
        int temp;
        int radTemp;
        id = "quesText";
        id = id + counter ;
        temp = getResources().getIdentifier(id,"id",getPackageName());
        textViewArray[counter] = (TextView) findViewById(temp);
        rad = "quesRad" + counter;
        radTemp = getResources().getIdentifier(rad,"id", getPackageName());
        radGroupArray[counter] = (RadioGroup) findViewById(radTemp);

        textViewArray[counter].setVisibility(View.VISIBLE);
        radGroupArray[counter].setVisibility(View.VISIBLE);
        Button button = (Button) findViewById(R.id.Next);
        button.setVisibility(View.GONE);


    }//end invisible



    public void onRadioButtonClicked(View view){
        if (counter < 4 ) {
            int temp;
            int radTemp;
            id = "quesText";
            id = id + counter ;
            temp = getResources().getIdentifier(id,"id",getPackageName());
            textViewArray[counter] = (TextView) findViewById(temp);
            rad = "quesRad" + counter;
            radTemp = getResources().getIdentifier(rad,"id", getPackageName());
            radGroupArray[counter] = (RadioGroup) findViewById(radTemp);



            if (counter < 4) {
                textViewArray[counter].setVisibility(View.GONE);
                radGroupArray[counter].setVisibility(View.GONE);

            }
            if (counter < 4) {

                    counter++;

                id = "";
                id = "quesText";
                id = id + counter ;
                temp = getResources().getIdentifier(id,"id",getPackageName());
                textViewArray[counter] = (TextView) findViewById(temp);
                textViewArray[counter].setVisibility(View.VISIBLE);
                rad = "quesRad" + counter;
                radTemp = getResources().getIdentifier(rad,"id", getPackageName());
                radGroupArray[counter] = (RadioGroup) findViewById(radTemp);
                radGroupArray[counter].setVisibility(View.VISIBLE);
            }


            checkScore(view);


        } //end if
        else { //end Display score and result

            textViewArray[counter].setVisibility(View.GONE);
            radGroupArray[counter].setVisibility(View.GONE);
            TextView result = (TextView) findViewById(R.id.result);
            if (score == 5) {
                result.setText(R.string.Finishtext1);
                result.setVisibility(View.VISIBLE);
            }
            if (score > 5 && score < 10)
            {
                result.setText(R.string.Finishtext2);
                result.setVisibility(View.VISIBLE);
            }
            if (score == 10)
            {
                result.setText(R.string.Finishtext3);
                result.setVisibility(View.VISIBLE);
            }



        }

    }

    public void checkScore(View view){
        switch(view.getId()) {
            case R.id.ans11:
                score = score + 1;
                break;
            case R.id.ans12:
                score = score + 2;
                break;
            case R.id.ans1:
                score = score + 1;
                break;
            case R.id.ans2:
                score = score + 2;
                break;
            case R.id.ques3ans1:
                score = score + 1;
                break;
            case R.id.ques3ans2:
                score = score + 2;
                break;
            case R.id.ques4ans1:
                score = score + 1;
                break;
            case R.id.ques4ans2:
                score = score + 2;
                break;
            case R.id.ques5ans1:
                score = score + 1;
                break;
            case R.id.ques5ans2:
                score = score + 2;
                break;
        }
    }



}
