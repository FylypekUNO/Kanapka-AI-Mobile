package com.kanapka_ai.mobile.react;

import android.content.Context;
import android.view.View;

public abstract class ReactComponent extends React {

    public abstract React render();

    @Override
    public View nativeRender(Context context) {
        return render().nativeRender(context);
    }
}
