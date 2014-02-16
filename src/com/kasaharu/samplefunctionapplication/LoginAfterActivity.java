package com.kasaharu.samplefunctionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoginAfterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginafter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

	@Override
	public void onStart() {
		super.onStart();
	}
}
