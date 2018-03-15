package com.webstormcomputers.newbabyquizareyouready;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invisible(View v)
    {
      TextView dissapear = (TextView) findViewById(R.id.openingText);
        dissapear.setVisibility(View.GONE);
        Button next = (Button) findViewById(R.id.Next);
        next.setVisibility(View.GONE);
        TextView quest1 = (TextView) findViewById(R.id.ques1Text);
        quest1.setVisibility(View.VISIBLE);
        RadioGroup quest1Rad = (RadioGroup) findViewById(R.id.ques1Rad);
         quest1Rad.setVisibility(View.VISIBLE);
            }


}
