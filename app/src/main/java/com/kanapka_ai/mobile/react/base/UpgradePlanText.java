package com.kanapka_ai.mobile.react.base;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.kanapka_ai.mobile.react.React;

public class UpgradePlanText extends React {
    private String message;

    public UpgradePlanText(String message) {
        this.message = message;
    }

    @Override
    public View nativeRender(Context context) {
        float pxSizeMultiplier = context.getResources().getDisplayMetrics().density;

        // <h2 className='text-2xl mb-4 gray-900'>{message}</h2>
        TextView textView = new TextView(context);

        // "text-2xl"
        textView.setTextSize(2, 24);

        // "mb-4" ???
        int padding = (int) (16 * pxSizeMultiplier);
        textView.setPadding(0, 0, 0, padding);

        // "gray-900" (gray-900 is #..111827)
        textView.setTextColor(0xFF111827);

        textView.setText(message);

        return textView;
    }
}
