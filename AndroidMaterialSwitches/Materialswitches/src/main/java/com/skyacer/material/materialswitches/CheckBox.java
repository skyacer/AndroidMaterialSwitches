package com.skyacer.material.materialswitches;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/**
 * Created by Wayne on 15/12/23.
 */
public class CheckBox extends CompoundButton {

    private int mUncheckedColor;
    private int mCheckedColor;
    private int mPointColor;
    private int mTickColor;
    private int mCheckBoxWidth;
    private int mCheckBoxHeight;
    private int mCornerRadius;
    private int mBorderWidth;
    private int mThumbCircleSize;
    private int mTickWidth;
    private int mThumbCircleRadius;
    private int mTickLeftRightPadding;
    private int mTickTopPadding;
    private int mTickBottomPadding;


    public CheckBox(Context context) {
        super(context);
    }

    public CheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray attributes = context.obtainStyledAttributes(attrs,R.styleable.CheckBox);
        mUncheckedColor = attributes.getColor(R.styleable.CheckBox_checkbox_unchecked_color
                ,ContextCompat.getColor(context,R.color.checkbox_unchecked_color));
        mCheckedColor = attributes.getColor(R.styleable.CheckBox_checkbox_checked_color
                , ContextCompat.getColor(context,R.color.checkbox_checked_color));
        attributes.recycle();
        mTickColor = ContextCompat.getColor(context,R.color.checkbox_tick_color);
        mCheckBoxWidth = getResources().getDimensionPixelSize(R.dimen.checkbox_width);
        mCheckBoxHeight = getResources().getDimensionPixelSize(R.dimen.checkbox_height);
        mCornerRadius = getResources().getDimensionPixelSize(R.dimen.checkbox_corner_radius);
        mThumbCircleSize = getResources().getDimensionPixelSize(R.dimen.checkbox_thumb_circle_size);
        mBorderWidth = getResources().getDimensionPixelSize(R.dimen.checkbox_border_width);
        mTickWidth = getResources().getDimensionPixelSize(R.dimen.checkbox_tick_width);
        mThumbCircleRadius = getResources().getDimensionPixelSize(R.dimen.checkbox_thumb_circle_radius);
        mTickLeftRightPadding = getResources().getDimensionPixelSize(R.dimen.checkbox_tick_left_right_padding);
        mTickTopPadding = getResources().getDimensionPixelSize(R.dimen.checkbox_tick_top_padding);
        mTickBottomPadding = getResources().getDimensionPixelSize(R.dimen.checkbo_tick_bottom_padding);

    }


}
