package com.kanapka_ai.mobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kanapka_ai.mobile.components.Layout;
import com.kanapka_ai.mobile.components.MainPage;
import com.kanapka_ai.mobile.react.ReactComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ReactComponent layout = new Layout();

        setContentView(layout.nativeRender(this));
    }

}