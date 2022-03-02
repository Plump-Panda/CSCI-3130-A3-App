package ca.dal.cs.csci3130.a3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button factorialButton = findViewById(R.id.factorialButton);
        buttonListenerSetup(factorialButton, true);

        Button cubeRootButton = findViewById(R.id.cubeRootButton);
        buttonListenerSetup(cubeRootButton, false);
    }


    protected int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    protected void calculateAnswer(boolean isFactorial){
        EditText numberBox = findViewById(R.id.numberBox);
        int number = Integer.parseInt(numberBox.getText().toString());
        int answer;
        if(isFactorial){
            answer = calculateFactorial(number);
        }else{
            answer = calculateCubeRoot(number);
        }
        TextView statusLabel = findViewById(R.id.result);
        statusLabel.setText(String.valueOf(answer));
    }

    protected void buttonListenerSetup(Button button, boolean isFactorial){
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                calculateAnswer(isFactorial);
            }
        });
    }

    protected int calculateCubeRoot(int number) {
        return (int) Math.cbrt(number);
    }
}