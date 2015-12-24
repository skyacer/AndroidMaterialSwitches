package com.skyacer.material.materialswitches;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.RectF;
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

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        int widthSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        if(widthSpecMode == MeasureSpec.EXACTLY){
            if (widthSpecSize < mCheckBoxWidth){
                size = mCheckBoxWidth;
            } else {
                size = widthSpecSize;
            }
        }   else {
            size = mCheckBoxWidth;
        }

        widthMeasureSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
        int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSpecSize = MeasureSpec.getSize(heightMeasureSpec);
        if (heightSpecMode == MeasureSpec.EXACTLY){
            if (heightSpecSize < mCheckBoxHeight){
                size = mCheckBoxHeight;
            }else {
                size = heightSpecSize;
            }
        }else {
            size = mCheckBoxHeight;
        }

        heightMeasureSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private RectF getRectFrame(){
        RectF rectF = new RectF();
        rectF.left = (getWidth() - mThumbCircleSize) / 2;
        rectF.top = (getHeight() - mThumbCircleSize) / 2;
        rectF.right = (getWidth() - mThumbCircleSize) / 2 + mThumbCircleSize;

        return rectF;
    }

    private int thumbCircleColor(int color){
        int alpha = Math.round(Color.alpha(color) * 0.3f);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        return Color.argb(alpha,red,green,blue);
    }


}
