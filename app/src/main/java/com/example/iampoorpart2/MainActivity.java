/*
NAME:
DATE:
ASSIGNMENT: I AM POOR PART 2
 */

/*
ASSIGNMENT: I AM POOR PART 2
-convert the component tree to CONSTRAINT LAYOUT (NOTE: Do not use Linear Layout for this assignment)
-add event listener to a component (either textview or imageview)
-when user touches the component the:
    -text changes color (your choice)
    -the image changes from diamond to coal
    -text changes from I AM RICH to I AM POOR
    -another click will revert the changes (ie, switches rich to poor and back again)
-Commit and push to your repos to submit assignment

 */

package com.example.iampoorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

//IMPORT THESE IF NOT ALREADY PRESENT
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //DECLARE YOUR VARIABLES THAT WILL STORE THE DIFFERENT COMPONENTS (BUTTONS, TEXT, ETC)
    Button button;
    TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //YOUR CODE STARTS HERE

        //FIND THE COMPONENT USING findViewById()
        //THE 'R' FILE IS A LIST OF ALL COMPONENTS
        //IF YOU GET AN ERROR - SUPPRESS THE ERROR
        button = (Button)findViewById(R.id.button_convert_1);
        text = findViewById(R.id.textView);


        //CREATE A CALLBACK FUNCTION
        /* A CALLBACK FUNCTION IS A METHOD CALL THAT HAS ANOTHER METHOD AS AN ARGUMENT
        THUS, THE METHOD CAN BE SENT TO THE COMPONENT THE USER INTERACTS WITH (IE, THE EVENT LISTENER)
        */

        //THE EXAMPLE BELOW IS FOR THE BUTTON DECLARED ABOVE
        //WHEN THE USER CLICKS THE BUTTON, THE CALLBACK FUNCTION WILL ACTIVATE
        //AND, IN THIS CODE, CHANGE THE TEXT COLOR TO GREEN
        //GIVE IT A TRY, THEN TRY COMPLETING THE ASSIGNMENT
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextColor(Color.GREEN);
            }
        });


    }
}