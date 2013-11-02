package com.frankandtessa.slide;

import com.frankandtessa.slide.R;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Slide extends RelativeLayout {

	private View mView;
	private TextView tv, tv1, tv2, tv3;
	private RelativeLayout rlCenter;
	private RelativeLayout rlLeft;
	private RelativeLayout rlRight;

	public Slide(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater li = LayoutInflater.from(context);
		mView = li.inflate(R.layout.slide, this);

		rlCenter = (RelativeLayout) mView.findViewById(R.id.rl1);
		rlLeft = (RelativeLayout) mView.findViewById(R.id.rl2);
		rlRight = (RelativeLayout) mView.findViewById(R.id.rl3);

		Animation animCenter = AnimationUtils.loadAnimation(context,
				R.anim.move);
		Animation animLeft = AnimationUtils.loadAnimation(context,
				R.anim.move_left);
		Animation animRight = AnimationUtils.loadAnimation(context,
				R.anim.move_right);

		rlCenter.startAnimation(animCenter);
		rlLeft.startAnimation(animLeft);
		rlRight.startAnimation(animRight);

		tv = (TextView) mView.findViewById(R.id.tv);
		tv1 = (TextView) mView.findViewById(R.id.tv1);
		tv2 = (TextView) mView.findViewById(R.id.tv2);
		tv3 = (TextView) mView.findViewById(R.id.tv3);
	}

	public void setText(String text) {
		tv.setText(text);
		tv1.setText(text);
		tv2.setText(text);
		tv3.setText(text);
	}

	public void setTextSize(int i) {
		tv.setTextSize(i);
		tv1.setTextSize(i);
		tv2.setTextSize(i);
		tv3.setTextSize(i);
	}

	public void setTextColor(int color) {
		tv.setTextColor(color);
		tv1.setTextColor(color);
		tv2.setTextColor(color);
		tv3.setTextColor(color);
	}

	public void setTypeface(Typeface typeFace) {
		tv.setTypeface(typeFace);
		tv1.setTypeface(typeFace);
		tv2.setTypeface(typeFace);
		tv3.setTypeface(typeFace);
	}

	public void setBackgroundColor(String strColor) {
		strColor = strColor.replace("#", "");
		rlLeft.setBackgroundColor(Color.parseColor("#66" + strColor));
		rlRight.setBackgroundColor(Color.parseColor("#66" + strColor));
		
		int colors[] = { Color.parseColor("#66" + strColor) , Color.parseColor("#00" + strColor), Color.parseColor("#66" + strColor) };
		GradientDrawable g = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, colors);
		rlCenter.setBackgroundDrawable(g);
	}
}
