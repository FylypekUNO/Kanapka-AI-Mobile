package com.kanapka_ai.mobile.react.base;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.kanapka_ai.mobile.react.React;

public class FlexCol extends React {
    private final React[] children;

    public FlexCol(React[] children) {
        this.children = children;
    }

    @Override
    public View nativeRender(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        for (React child : children) {
            if (child == null) continue;

            linearLayout.addView(child.nativeRender(context));
        }

        return linearLayout;
    }
}
