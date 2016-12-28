package com.example.sherman.mynewapp19;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        RelativeLayout myLayout = new RelativeLayout(this); // create object of relative layout an name it as myLayout
        Button myButton = new Button(this);

        myLayout.addView(myButton);
        setContentView(myLayout);
    }


}
