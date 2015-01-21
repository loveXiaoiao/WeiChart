package com.gongming.weichart.activity;

import com.gongming.weichart.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SettingActivity extends Activity {
	private ImageView imageView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.me_settings);
		
		imageView = (ImageView)findViewById(R.id.msimage1);
		imageView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SettingActivity.this, MainActivity.class);
				intent.putExtra("click_key", "me_back");
				startActivityForResult(intent,0);
			}
		
		});
	}

}
