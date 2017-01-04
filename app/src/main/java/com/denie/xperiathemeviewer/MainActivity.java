package com.denie.xperiathemeviewer;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    Button button3;
    ToggleButton toggleButton3;
    CheckBox checkBox3;
    RadioButton radioButton3;
    Switch switch3;
    ImageView imageView, imageView2;
    GradientDrawable backgroundGradient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button3 = (Button)findViewById(R.id.button3);
        button3.setPressed(true);
        toggleButton3 = (ToggleButton)findViewById(R.id.toggleButton3);
        toggleButton3.setPressed(true);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox3.setPressed(true);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setPressed(true);
        imageView = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        getThemeAccentColor();
        getThemePrimaryColor();

    }

    private void getThemeAccentColor() {
        int color = android.R.attr.colorAccent;
        backgroundGradient = (GradientDrawable) imageView.getDrawable();
        TypedValue outValue = new TypedValue();
        this.getTheme().resolveAttribute(color, outValue, true);
        backgroundGradient.setColor(outValue.data);
    }

    private void getThemePrimaryColor() {
        int color = android.R.attr.colorPrimary;
        backgroundGradient = (GradientDrawable) imageView2.getDrawable();
        TypedValue outValue = new TypedValue();
        this.getTheme().resolveAttribute(color, outValue, true);
        backgroundGradient.setColor(outValue.data);
    }

}
