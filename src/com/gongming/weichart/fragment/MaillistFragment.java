package com.gongming.weichart.fragment;

import java.util.ArrayList;
import java.util.List;

import com.gongming.weichart.R;
import com.gongming.weichart.view.MailListView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MaillistFragment extends Fragment {
	
	private View mParent;
	private ListView listView;
	private FragmentActivity mActivity;
	List<String> contacts = new ArrayList<String>();
	private MailListView mailListView;
	String a[] = {"新的朋友","群聊","标签","公众号","啊亲爱的","白河静流","彪哥","CC","程果","陈辉NewYork","戴乐"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_maillist, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mParent = getView();
		mActivity = getActivity();
		for(int i=0;i<a.length;i++){
			contacts.add(a[i]);
		}
		mailListView = new MailListView(mActivity, contacts);
		listView = (ListView) mParent.findViewById(R.id.MailListItem);
		listView.setAdapter(mailListView);
		
	}

}
