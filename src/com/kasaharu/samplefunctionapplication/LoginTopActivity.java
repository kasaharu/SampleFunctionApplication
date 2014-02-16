package com.kasaharu.samplefunctionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginTopActivity extends Activity {
	Button mNextButton;
	EditText mInputPassWord;

	private final String CORRECTPASS = "test";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logintop);
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
		mNextButton = (Button)findViewById(R.id.btnNext);
		mInputPassWord = (EditText)findViewById(R.id.editTxtPW);
		mNextButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean isCorrectPW = false;
				isCorrectPW = IsCorrectPassWord();
				if (isCorrectPW) {
    				Intent intent = new Intent(LoginTopActivity.this, LoginAfterActivity.class);
    				startActivity(intent);
				} else {
			        Toast toast = Toast.makeText(LoginTopActivity.this, "パスワードが間違っています。", Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.CENTER, 0, 0);
			        toast.show();
				}
			}
		});
	}

	private boolean IsCorrectPassWord() {
		String inputText = mInputPassWord.getText().toString();
		Log.d("forDebug", "inputText = " + inputText);
		if (inputText.equals(CORRECTPASS)) {
			return true;
		} else {
    		return false;
		}
	}
}
