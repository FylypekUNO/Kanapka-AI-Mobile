package com.kanapka_ai.mobile.react.base;

import android.content.Context;
import android.graphics.Outline;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;

import com.kanapka_ai.mobile.react.React;

public class FlexCol3 extends React {
    private React[] children;

    public FlexCol3(React[] children) {
        this.children = children;
    }

    @Override
    public View nativeRender(Context context) {
        float pxSizeMultiplier = context.getResources().getDisplayMetrics().density;

        // <div className='bg-white p-6 rounded shadow-md w-96'>
        LinearLayout linearLayout = new LinearLayout(context);

        // default orientation is vertical
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // "bg-white"
        linearLayout.setBackgroundColor(0xFFFFFFFF);

        // "p-6"
        int padding = (int) (24 * pxSizeMultiplier);
        linearLayout.setPadding(padding, padding, padding, padding);

        // "rounded" (4px)
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 4 * pxSizeMultiplier);
            }
        });

        // "shadow-md"
        linearLayout.setElevation(6);

        // "w-96" (384px)
        int width = (int) (384 * pxSizeMultiplier);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(width, LinearLayout.LayoutParams.WRAP_CONTENT));

        for (React child : children) {
            if (child == null) continue;

            linearLayout.addView(child.nativeRender(context));
        }

        return linearLayout;
    }
}
