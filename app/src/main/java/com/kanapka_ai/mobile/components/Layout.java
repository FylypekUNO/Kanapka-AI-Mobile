package com.kanapka_ai.mobile.components;

import com.kanapka_ai.mobile.react.React;
import com.kanapka_ai.mobile.react.ReactComponent;
import com.kanapka_ai.mobile.react.base.FlexCol;

public class Layout extends ReactComponent {

        @Override
        public React render() {
            return new FlexCol(new React[]{
                    new MainPage("Random Message"),
            });
        }
}
