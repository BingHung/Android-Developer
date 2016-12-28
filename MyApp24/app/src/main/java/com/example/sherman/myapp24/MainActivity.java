package com.example.sherman.myapp24;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View; //handling event ...
import android.widget.Button;
import android.widget.TextView;

// Event handling (Divided into Two Parts) -> (Event Listener , Call Back Method)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //detect event  -> reference to button (ID)
        Button myButton = (Button) findViewById(R.id.mybtn); //(Type Casting)

        // Add Action listener
        myButton.setOnClickListener (

            // create interface
                new Button.OnClickListener() {

                    // add call back method in this interface
                    public void onClick(View v) {
                        TextView myText = (TextView) findViewById(R.id.myText);
                        myText.setText("Button Clicked");
                    }
                }
        );

        myButton.setOnLongClickListener(

                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v)  {
                        TextView myText = (TextView) findViewById(R.id.myText);
                        myText.setText("Long Button Press");
                        return true;
                    }
                }
        );


    }

}

