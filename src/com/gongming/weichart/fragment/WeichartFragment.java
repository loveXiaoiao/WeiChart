package com.gongming.weichart.fragment;

import java.util.ArrayList;
import java.util.List;

import com.gongming.weichart.R;
import com.gongming.weichart.entity.Contact;
import com.gongming.weichart.view.MailListView;
import com.gongming.weichart.view.WeichartListView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class WeichartFragment extends Fragment {
	private View mParent;
	private ListView listView;
	private FragmentActivity mActivity;
	List<Contact> contacts = new ArrayList<Contact>();
	private WeichartListView weichartListView;
	String a[] = {"王克飞","任子行武汉研发","流年","CC","秦巴山生态农业","佳宇","孙慧","QQ离线助手","李平辉","彭杉","严哥"};
	String b[] = {"你好2015","发大水","发的","发生的","法撒旦法","234","45235","核桃仁","核桃仁","5哈哈","版本"};
	String c[] = {"2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日","2015年1月2日"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_weichart, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mParent = getView();
		mActivity = getActivity();
		for(int i=0;i<a.length;i++){
			Contact contact = new Contact();
			contact.setName(a[i]);
			contact.setMessage(b[i]);
			contact.setContactTime(c[i]);
			contacts.add(contact);
		}
		weichartListView = new WeichartListView(mActivity, contacts);
		listView = (ListView) mParent.findViewById(R.id.WeichartListItem);
		listView.setAdapter(weichartListView);
		
	}

}
