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
    int questionCount = 6;
    int counter = 1;
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
            if (counter <6 ) {
                textViewArray[counter].setVisibility(View.VISIBLE);
                radGroupArray[counter].setVisibility(View.VISIBLE);
            }
            if (counter != 6) {
                counter++;
            }



        } //end if
        else { //end Display score and result
            int prev = counter - 1;
            textViewArray[prev].setVisibility(View.GONE);
            radGroupArray[prev].setVisibility(View.GONE);
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("You finished the quiz");
            result.setVisibility(View.VISIBLE);
            Button button = (Button) findViewById(R.id.Next);
            button.setVisibility(View.GONE);
            TextView total = (TextView) findViewById(R.id.scoreTotal);
            Log.v ("Score", "Value"+ score);
            //total.setText(score);
            //total.setVisibility(View.VISIBLE);


        }
    }//end invisible
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
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
        TextView total = (TextView) findViewById(R.id.scoreTotal);
        total.setText(Integer.toString(score));
    }
/****
 calculateScore(radID);
 }
 public void calculateScore (String radid ) {

 switch (radid)
 {
 case "ans11":
 score = score + 1 ;

 break;//the
 case "ans12":
 score= score + 2;
 break;

 }

 } **/

}
