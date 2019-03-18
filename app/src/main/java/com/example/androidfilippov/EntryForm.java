package com.example.androidfilippov;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_form);

        final EditText usernameEditT = (EditText) findViewById(R.id.usernameEdit);
        final EditText emailEditT = (EditText) findViewById(R.id.emailEdit);
        final Button okBtn = (Button) findViewById(R.id.okBtn);
        final Button clearBtn = (Button) findViewById(R.id.clearBtn);
        final TextView result = (TextView) findViewById(R.id.resultTView);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setVisibility(View.VISIBLE);

                Editable usernameEnter = usernameEditT.getText();
                Editable emailEnter = emailEditT.getText();

                result.setText("Подписка на рассылку успешно оформлена для пользователя " +
                        usernameEnter + " на электронный адрес " + emailEnter);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setVisibility(View.INVISIBLE);
                usernameEditT.setText(" ");
                emailEditT.setText(" ");
            }
        });
    }
}
