package com.kanapka_ai.mobile.react.base;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import com.kanapka_ai.mobile.react.React;

public class FlexColGravityCenter extends React {
    private React[] children;

    public FlexColGravityCenter(React[] children) {
        this.children = children;
    }

    @Override
    public View nativeRender(Context context) {
        float pxSizeMultiplier = context.getResources().getDisplayMetrics().density;

        // <div className='fixed inset-0 flex items-center justify-center bg-gray-800 bg-opacity-50'>

        LinearLayout linearLayout = new LinearLayout(context);

        // "fixed"
        // ignore, not supported in Android

        // "inset-0"
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

        // "flex"
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // "items-center justify-center"
        linearLayout.setGravity(Gravity.CENTER);

        // "bg-gray-800 bg-opacity-50" (gray-800 is #..1f2937, bg-opacity-50 is #80......)
        linearLayout.setBackgroundColor(0x801f2937);

        for (React child : children) {
            if (child == null) continue;

            linearLayout.addView(child.nativeRender(context));
        }

        return linearLayout;
    }
}
