package com.kanapka_ai.mobile.components;

import android.content.Context;
import android.graphics.Outline;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kanapka_ai.mobile.react.React;
import com.kanapka_ai.mobile.react.ReactComponent;
import com.kanapka_ai.mobile.react.base.FlexCol3;
import com.kanapka_ai.mobile.react.base.FlexColGravityCenter;
import com.kanapka_ai.mobile.react.base.MessageText;
import com.kanapka_ai.mobile.react.base.UpgradePlanText;

public class MainPage extends ReactComponent {
    private String message;

    public MainPage(String message) {
        this.message = message;
    }

    @Override
    public React render() {
        return new FlexColGravityCenter(new React[]{
            new FlexCol3(new React[]{
                new UpgradePlanText("Upgrading Plan"),
                    (message != null) ? new MessageText(message) : null
            })
        });
    }
}
