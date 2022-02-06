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
        factorialButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText numberBox = findViewById(R.id.numberBox);
                int number = Integer.parseInt(numberBox.getText().toString());
                int factorial = calculateFactorial(number);
                TextView statusLabel = findViewById(R.id.result);
                statusLabel.setText(String.valueOf(factorial));
            }
        });

        Button cubeRootButton = findViewById(R.id.cubeRootButton);
        cubeRootButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText numberBox = findViewById(R.id.numberBox);
                int number = Integer.parseInt(numberBox.getText().toString());
                int cubeRoot = calculateCubeRoot(number);
                TextView statusLabel = findViewById(R.id.result);
                statusLabel.setText(String.valueOf(cubeRoot));
            }
        });
    }


    protected int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    protected int calculateCubeRoot(int number) {
        return (int) Math.cbrt(number);
    }
}