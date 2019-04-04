package com.example.androidfilippov;

import android.app.Activity;
import android.content.Intent;

public class Utils {

    private static int colorTheme;
    private static int marginTheme;

    public final static int THEME_BLACK = 0;
    public final static int THEME_GREEN = 1;
    public final static int THEME_BLUE = 2;

    public final static int THEME_MARGIN1 = 0;
    public final static int THEME_MARGIN2 = 1;
    public final static int THEME_MARGIN3 = 2;

    public static void changeToColorTheme(Activity activity, int theme) {
        colorTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    public static void changeToMarginTheme(Activity activity, int theme) {
        marginTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void onActivityCreateSetColorTheme(Activity activity) {
        switch (colorTheme) {
            default:
            case THEME_BLACK:
                activity.setTheme(R.style.BlackTheme);
                break;
            case THEME_GREEN:
                activity.setTheme(R.style.GreenTheme);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.BlueTheme);
                break;
        }
    }

    public static void onActivityCreateSetMarginTheme(Activity activity) {
        switch (marginTheme) {
            case THEME_MARGIN1:
                activity.setTheme(R.style.Margin1Theme);
                break;
            case THEME_MARGIN2:
                activity.setTheme(R.style.Margin2Theme);
                break;
            case THEME_MARGIN3:
                activity.setTheme(R.style.Margin3Theme);
                break;
        }
    }
}
