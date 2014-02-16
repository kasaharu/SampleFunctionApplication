package com.kasaharu.samplefunctionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MonkeyrunnerTestActivity extends Activity {
    TextView mTxtCorrentCondition;
	Button mBtnSwitchCondition;
	private final int SWITCH_ON  = R.string.condition_on;
	private final int SWITCH_OFF = R.string.condition_off;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mokeyrunner_test);
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
        mTxtCorrentCondition = (TextView)findViewById(R.id.txtCondition);
		mBtnSwitchCondition = (Button)findViewById(R.id.btnSwitchCondition);
		mBtnSwitchCondition.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(mTxtCorrentCondition.getText().equals("ON")) {
					mTxtCorrentCondition.setText(SWITCH_OFF);
					mBtnSwitchCondition.setText(SWITCH_ON);
				} else {
					mTxtCorrentCondition.setText(SWITCH_ON);
					mBtnSwitchCondition.setText(SWITCH_OFF);
				}
			}
		});
	}
}
