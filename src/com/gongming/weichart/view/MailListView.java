package com.gongming.weichart.view;

import java.util.ArrayList;
import java.util.List;

import com.gongming.weichart.R;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MailListView extends BaseAdapter {
	
	private final Context context;
	private List<String> contacts = new ArrayList<String>();
	
	public MailListView(Context context, List<String> contacts) {
		this.context = context;
		if (contacts != null) this.contacts = contacts;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return contacts.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
				ViewHolder holder = null;
				if (convertView == null) {
					LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
					// 使用Vliew的对象itemView与R.layout.item关联
					convertView = inflater.inflate(R.layout.mail_listview, null);
					holder = new ViewHolder();
					holder.contactName = (TextView) convertView
							.findViewById(R.id.mitemText);
					holder.contactAvatar = (ImageView) convertView
							.findViewById(R.id.mitemImage);
					convertView.setTag(holder);
				} else {
					holder = (ViewHolder) convertView.getTag();
				}
				String contact = contacts.get(position);
				holder.contactName.setText(contact);
				holder.contactAvatar.setImageResource(R.drawable.ic_launcher);
				return convertView;
	}
	
	private class ViewHolder {
		public TextView contactName;
		public ImageView contactAvatar;
	}

}
