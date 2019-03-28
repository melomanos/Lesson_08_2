package com.example.androidfilippov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AppBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_app_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_first_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    FirstActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "FirstActivity открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_splash_screen_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    SplashScreenActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "SplashScreenActivity открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_entry_form_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    EntryFormActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "Подписка открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_endless_transition_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    EndlessTransitionActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "Просмотр фото открыт",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_check_box_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    CheckBoxActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "CheckBoxActivity открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_spinner_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    SpinnerActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "SpinnerActivity открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_calendar_view_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    CalendarViewActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "CalendarViewActivity открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_shared_preferences_notes_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    SharedPreferencesNotesActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "Записная книжка открыта",
                    Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_calc_activity) {
            Intent intentNotes = new Intent(AppBarActivity.this,
                    CalcActivity.class);
            startActivity(intentNotes);
            Toast.makeText(AppBarActivity.this, "Калькулятор открыт",
                    Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
