package com.example.dailogapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    public MainActivity(Context context){
        super();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView();

        editText = findViewById(R.id.editText);

        Button uppercaseButton =findViewById(R.id.uppercase);
        Button lowercaseButton = findViewById(R.id.lowercaseButton);
        Button initcapButton = findViewById(R.id.inticapButton);
        Button reveseButton = findViewById(R.id.reverseButton);
        uppercaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                String editedText = text.toUpperCase();
                dismissDialog();
            }
        });
    }

    private void dismissDialog() {
    }

    private void setContentView() {
    }
}