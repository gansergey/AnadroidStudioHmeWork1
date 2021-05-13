package net.gan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edit_text1);
        TextView textView = findViewById(R.id.text1);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        SwitchCompat aSwitch = findViewById(R.id.switch1);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Button button = findViewById(R.id.button);
        ImageView image = findViewById(R.id.imageView);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()){
                    image.setVisibility(View.INVISIBLE);
                }else{
                    image.setVisibility(View.VISIBLE);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(editText.getText().toString());

                if (aSwitch.isChecked()){
                    button.setBackgroundColor(button.getResources().getColor(R.color.additional_color_yellow));
                }else{
                    button.setBackgroundColor(button.getResources().getColor(R.color.button_color));
                }

                if (checkBox.isChecked()){
                    textView.setVisibility(View.INVISIBLE);
                }else{
                    textView.setVisibility(View.VISIBLE);
                }

            }
        });

    }
}