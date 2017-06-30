package com.app.dragable_views;

import android.content.Context;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

/**
 * Created by Pratik Surela on 30/6/17.
 */

public class DraggableViewMain implements View.OnTouchListener, View.OnDragListener {

    private ViewGroup destiViewGroup;
    private Context context;
    private ArrayList<View> viewsArrayList = new ArrayList<>();
    public OnViewSelection viewSelection;

    public DraggableViewMain() {

    }

    public DraggableViewMain(Context context, ViewGroup destiViewGroup) {
        this.context = context;
        this.destiViewGroup = destiViewGroup;
        this.viewSelection = (OnViewSelection) context;

        destiViewGroup.setOnDragListener(this);

    }

    public void addView(View view) {
        viewsArrayList.add(view);
        for (int i = 0; i < viewsArrayList.size(); i++) {
            viewsArrayList.get(i).setOnTouchListener(this);
        }
    }

    @Override
    public boolean onDrag(View layoutview, DragEvent dragevent) {
        int action = dragevent.getAction();
        View view = (View) dragevent.getLocalState();

        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                break;
            case DragEvent.ACTION_DROP:
                ViewGroup owner = (ViewGroup) view.getParent();
                owner.removeView(view);
                RelativeLayout container = (RelativeLayout) layoutview;
                container.addView(view);
                view.setVisibility(View.VISIBLE);

                if (container.getId() == destiViewGroup.getId()) {
                    view.setOnTouchListener(null);
                    owner.setOnDragListener(null);
                }

                for (int i = 0; i < viewsArrayList.size(); i++) {
                    if (view.getId() == viewsArrayList.get(i).getId()) {
                        viewSelection.viewSelectedPosition(i);
                    }
                }

                break;
            case DragEvent.ACTION_DRAG_ENDED:
                if (dropEventNotHandled(dragevent)) {
                    view.setVisibility(View.VISIBLE);
                }
                break;
            default:
                break;
        }
        return true;
    }

    private boolean dropEventNotHandled(DragEvent dragEvent) {
        return !dragEvent.getResult();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(null, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }
    }
}
