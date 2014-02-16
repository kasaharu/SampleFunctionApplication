package com.kasaharu.samplefunctionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends Activity {
	Button mBtnToMonkeyrunnerTest;
	Button mBtnToLoginActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

	@Override
	public void onStart() {
		super.onStart();
		mBtnToMonkeyrunnerTest = (Button)findViewById(R.id.btnToMonkeyRunner);
		mBtnToMonkeyrunnerTest.setOnClickListener(new OnClickTransitionListner(MonkeyrunnerTestActivity.class));
		mBtnToLoginActivity = (Button)findViewById(R.id.btnToLogin);
		mBtnToLoginActivity.setOnClickListener(new OnClickTransitionListner(LoginTopActivity.class));
	}

	public class OnClickTransitionListner implements OnClickListener {
		Class<?> mClass;

		public OnClickTransitionListner(Class c) {
			mClass = c;
		}
		@Override
			public void onClick(View v) {
    		    Intent intent = new Intent(StartActivity.this, mClass);
    		    startActivity(intent);
			}

	}

}
