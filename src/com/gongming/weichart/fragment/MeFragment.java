package com.gongming.weichart.fragment;


import com.gongming.weichart.R;
import com.gongming.weichart.activity.PersonInfoActivity;
import com.gongming.weichart.activity.SettingActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MeFragment extends Fragment {
	
	
	private View mParent;
	private FragmentActivity mActivity;
	private ImageView imageView = null;
	private TextView textView = null;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_me, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mParent = getView();
		mActivity = getActivity();
		imageView = (ImageView)mActivity.findViewById(R.id.image21);
		imageView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(mActivity, PersonInfoActivity.class);
				intent.putExtra("click_key", "personImg");
				startActivityForResult(intent,0);
			}
		
		});
		textView = (TextView)mActivity.findViewById(R.id.meTextviewSet);
		textView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(mActivity, SettingActivity.class);
				intent.putExtra("click_key", "setting");
				startActivityForResult(intent,0);
			}
		
		});
	}
	

}
