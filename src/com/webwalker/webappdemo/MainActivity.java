package com.webwalker.webappdemo;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Intent it = new Intent();
		it.setClass(this, HardwareSpeedupActivity.class);

		startActivity(it);
		finish();
	}
}
