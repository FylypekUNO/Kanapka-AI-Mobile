package com.kanapka_ai.mobile.react.base;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.kanapka_ai.mobile.react.React;

public class MessageText extends React {
    private String message;

    public MessageText(String message) {
        this.message = message;
    }

    @Override
    public View nativeRender(Context context) {
        float pxSizeMultiplier = context.getResources().getDisplayMetrics().density;

        // <p className='mt-4 text-center gray-900'>{message}</p>
        TextView textView = new TextView(context);

        // "mt-4" ???
        int padding = (int) (16 * pxSizeMultiplier);
        textView.setPadding(0, padding, 0, 0);

        // "text-center"
        textView.setGravity(Gravity.CENTER_HORIZONTAL);

        // "gray-900" (gray-900 is #..111827)
        textView.setTextColor(0xFF111827);

        textView.setText(message);

        return textView;
    }
}
