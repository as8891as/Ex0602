package com.example.ex0602;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    String button_text;
    int counter=0;
    int numberCheck;
    boolean sevenCheck=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
    }

    public void pressed(View view) {
        counter++;
        numberCheck=counter;
        while ((numberCheck/10>0) || (numberCheck==7))
        {
            if ((numberCheck%10==7) || (numberCheck%7==0))
            {
                sevenCheck=true;
            }
            numberCheck/=10;
        }
        if (sevenCheck)
        {
            button_text="BOOM !";
        }
        else
        {
            button_text="This is a click number: "+counter;
        }
        sevenCheck=false;
        btn.setText(button_text);
    }
}