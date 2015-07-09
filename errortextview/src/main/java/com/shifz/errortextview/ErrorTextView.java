package com.shifz.errortextview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Shifar Shifz on 7/9/2015.
 */
public class ErrorTextView extends TextView {
    public ErrorTextView(Context context) {
        super(context);
        init();
    }

    public ErrorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ErrorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setTextColor(Color.RED);
    }
}
