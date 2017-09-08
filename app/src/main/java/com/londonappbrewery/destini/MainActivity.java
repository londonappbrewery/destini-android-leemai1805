package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int storyIndex =1;
    final int T1_Ans1 = 0;
    final int T1_Ans2 =1 ;
    final int T1_Story = 2;
    final int T2_Ans1 = 3;
    final int T2_Ans2 = 4;
    final int T2_Story = 5;
    final int T3_Ans1 = 6;
    final int T3_Ans2 = 7;
    final int T3_Story = 8;
    final int T4_End = 9;
    final int T5_End = 10;
    final int T6_End = 11;

    final int [] text= {
                R.string.T1_Ans1,
                R.string.T1_Ans2,
                R.string.T1_Story,
                R.string.T2_Ans1,
                R.string.T2_Ans2,
                R.string.T2_Story,
                R.string.T3_Ans1,
                R.string.T3_Ans2,
                R.string.T3_Story,
                R.string.T4_End,
                R.string.T5_End,
                R.string.T6_End
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyIndex == 1) {
                    storyTextView.setText(text[T3_Story]);
                    buttonTop.setText(text[T3_Ans1]);
                    buttonBottom.setText(text[T3_Ans2]);
                    storyIndex = 3;
                }
                else if (storyIndex == 2){
                    storyTextView.setText(text[T3_Story]);
                    buttonTop.setText(text[T3_Ans1]);
                    buttonBottom.setText(text[T3_Ans2]);
                    storyIndex = 3;
                }
                else if (storyIndex == 3){
                    storyTextView.setText(text[T6_End]);
                    Toast.makeText(getApplicationContext(),"rotate your phone to start over",Toast.LENGTH_LONG).show();
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                    storyIndex = 4;

                }


            }



        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1) {
                    storyTextView.setText(text[T2_Story]);
                    buttonTop.setText(text[T2_Ans1]);
                    buttonBottom.setText(text[T2_Ans2]);
                    storyIndex = 2;
                }
                else if (storyIndex == 2){
                    storyTextView.setText(text[T4_End]);
                    Toast.makeText(getApplicationContext(),"rotate your phone to start over",Toast.LENGTH_LONG).show();
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                    storyIndex = 4;
                }
                else if (storyIndex == 3){
                    storyTextView.setText(text[T5_End]);
                    Toast.makeText(getApplicationContext(),"rotate your phone to start over",Toast.LENGTH_LONG).show();
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                    storyIndex = 4;

                }
                else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
                    alert.setTitle("The story has ended");
                    alert.setCancelable(true);
                    alert.setMessage("To start over rotate your phone");
                }



            }
        });

    }
}
