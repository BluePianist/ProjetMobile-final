package com.example.projetmobile.View;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;
import android.util.AttributeSet;

public class DetailTransition extends TransitionSet {
    public DetailTransition() {
        init();
    }

    /**
     * This constructor allows us to use this transition in XML
     */
    public DetailTransition(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setOrdering(ORDERING_TOGETHER);
        addTransition(new ChangeBounds()).
                addTransition(new ChangeTransform()).
                addTransition(new ChangeImageTransform());
    }
}
