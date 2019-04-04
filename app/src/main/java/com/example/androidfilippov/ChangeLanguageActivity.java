package com.example.androidfilippov;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;

public class ChangeLanguageActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);
        Utils.onActivityCreateSetColorTheme(this);
        Utils.onActivityCreateSetMarginTheme(this);

        Button okBtnLanguage = findViewById(R.id.okBtnLanguage);

        Button okBtnColor = findViewById(R.id.okBtnColor);
        okBtnColor.setOnClickListener(this);

        Button okBtnMargin = findViewById(R.id.okBtnMargin);
        okBtnMargin.setOnClickListener(this);

        okBtnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner spinner = findViewById(R.id.languageSpinner);
                int selectedLang = spinner.getSelectedItemPosition();
                System.out.println(selectedLang);

                if (selectedLang == 0) {
                    Locale locale = new Locale("ru");
                    Configuration config = new Configuration();
                    config.setLocale(locale);
                    getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                    recreate();
                } else if (selectedLang == 1) {
                    Locale locale = new Locale("en");
                    Configuration config = new Configuration();
                    config.setLocale(locale);
                    getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                    recreate();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        Spinner colorSpinner = findViewById(R.id.colorSpinner);
        Spinner marginSpinner = findViewById(R.id.marginSpinner);

        int selectedColor = colorSpinner.getSelectedItemPosition();
        int selectedMargin = marginSpinner.getSelectedItemPosition();

        System.out.println(selectedColor);
        System.out.println(selectedMargin);

        if (selectedColor == 0) {
            Utils.changeToColorTheme(this, Utils.THEME_BLACK);
        } else if (selectedColor == 1) {
            Utils.changeToColorTheme(this, Utils.THEME_GREEN);
        } else if (selectedColor == 2) {
            Utils.changeToColorTheme(this, Utils.THEME_BLUE);
        }

        if (selectedMargin == 0) {
            Utils.changeToMarginTheme(this, Utils.THEME_MARGIN1);
        } else if (selectedMargin == 1) {
            Utils.changeToMarginTheme(this, Utils.THEME_MARGIN2);
        } else if (selectedMargin == 2) {
            Utils.changeToMarginTheme(this, Utils.THEME_MARGIN3);
        }
    }
}
