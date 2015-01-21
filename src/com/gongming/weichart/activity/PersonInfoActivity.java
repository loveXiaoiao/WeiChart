package com.gongming.weichart.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.gongming.weichart.R;

public class PersonInfoActivity extends Activity {
	private ImageView imageView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.me_person_information);
		imageView = (ImageView)findViewById(R.id.mpimage1);
		imageView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonInfoActivity.this, MainActivity.class);
				intent.putExtra("click_key", "me_back");
				startActivityForResult(intent,0);
			}
		
		});
	}

}
