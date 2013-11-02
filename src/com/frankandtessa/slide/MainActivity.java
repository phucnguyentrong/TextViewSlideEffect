package com.frankandtessa.slide;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Slide slide1 = (Slide)findViewById(R.id.slide);
		slide1.setText("slide to cancel");
		
		Slide slide2 = (Slide)findViewById(R.id.slide2);
		slide2.setBackgroundColor("#3A3B41");
		slide2.setTextColor(Color.parseColor("#33FFFF"));
		slide2.setText("Happy developer!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
