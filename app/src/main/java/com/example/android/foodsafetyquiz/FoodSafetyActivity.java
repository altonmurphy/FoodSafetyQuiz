package com.example.android.foodsafetyquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FoodSafetyActivity extends AppCompatActivity {

    int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_safety);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food_safety, menu);
        return true;
    }

    public void submitButtonClicked (View view){
            quizScore = 0;
            RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroupQ1); // set dialog.findViewById instead findViewById
            int rgidQ1 = radioGroup1.getCheckedRadioButtonId();
            if (rgidQ1 == R.id.q1a4) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroupQ2); // set dialog.findViewById instead findViewById
            int rgidQ2 = radioGroup2.getCheckedRadioButtonId();
            if (rgidQ2 == R.id.q2a3) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroupQ3); // set dialog.findViewById instead findViewById
            int rgidQ3 = radioGroup3.getCheckedRadioButtonId();
            if (rgidQ3 == R.id.q3a4) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radioGroupQ4); // set dialog.findViewById instead findViewById
            int rgidQ4 = radioGroup4.getCheckedRadioButtonId();
            if (rgidQ4 == R.id.q4a2) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radioGroupQ5); // set dialog.findViewById instead findViewById
            int rgidQ5 = radioGroup5.getCheckedRadioButtonId();
            if (rgidQ5 == R.id.q5a3) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radioGroupQ6); // set dialog.findViewById instead findViewById
            int rgidQ6 = radioGroup6.getCheckedRadioButtonId();
            if (rgidQ6 == R.id.q6a3) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radioGroupQ7); // set dialog.findViewById instead findViewById
            int rgidQ7 = radioGroup7.getCheckedRadioButtonId();
            if (rgidQ7 == R.id.q7a2) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.radioGroupQ8); // set dialog.findViewById instead findViewById
            int rgidQ8 = radioGroup8.getCheckedRadioButtonId();
            if (rgidQ8 == R.id.q8a2) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.radioGroupQ9); // set dialog.findViewById instead findViewById
            int rgidQ9 = radioGroup9.getCheckedRadioButtonId();
            if (rgidQ9 == R.id.q9a2) {
                quizScore = quizScore + 1;
            }
            RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.radioGroupQ10); // set dialog.findViewById instead findViewById
            int rgidQ10 = radioGroup10.getCheckedRadioButtonId();
            if (rgidQ10 == R.id.q10a2) {
                quizScore = quizScore + 1;
            }


        double decimalGrade = (double) quizScore / 10 * 100;
        int finalGrade = (int) decimalGrade;

        String scoreMessage = "";

        if(finalGrade >= 80){
            scoreMessage = "PASSED" + "\nFinal Score: " + finalGrade + "%! " + "\n" + "\nCongratulations, you passed your Food Safety Exam!";
        }
        if(finalGrade < 80){
            scoreMessage = "Failed" + "\nFinal Score: " + finalGrade + "%! " + "\n" + "\nA final score of at least 80% is required to pass. " + "\nGreat attempt, check over your answers and try again!";
        }
        displayScore(scoreMessage);
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayScore(String message) {
        TextView finalScoreTextView = (TextView) findViewById(R.id.final_score_text_view);
        finalScoreTextView.setText(message);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        //switch (view.getId()) {
            //case R.id.q1a1:
                //if (checked)
                    // Question 1 Answer 1
                    //break;
            //case R.id.q1a2:
              //  if (checked)
                    // Question 1 Answer 2
                   // break;
            //case R.id.q1a3:
               // if (checked)
                    // Question 1 Answer 3
                  //  break;
            //case R.id.q1a4:
                //if (checked){
                    //quizScore = quizScore + 1;
              //  }
                    // Question 1 Answer 4
                    //break;

             //   }
        }

    }
