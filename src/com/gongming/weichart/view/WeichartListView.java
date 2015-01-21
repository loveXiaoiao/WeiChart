package com.gongming.weichart.view;

import java.util.ArrayList;
import java.util.List;

import com.gongming.weichart.R;
import com.gongming.weichart.entity.Contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WeichartListView extends BaseAdapter {
	private final Context context;
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public WeichartListView(Context context, List<Contact> contacts) {
		this.context = context;
		if (contacts != null) this.contacts = contacts;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return contacts.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			// 使用Vliew的对象itemView与R.layout.item关联
			convertView = inflater.inflate(R.layout.weichart_listview, null);
			holder = new ViewHolder();
			holder.contactName = (TextView) convertView.findViewById(R.id.witemTitle);
			holder.contactAvatar = (ImageView) convertView.findViewById(R.id.witemImage);
			holder.message = (TextView) convertView.findViewById(R.id.witemText);
			holder.contactTime = (TextView) convertView.findViewById(R.id.witemText2);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		Contact contact = contacts.get(position);
		holder.contactName.setText(contact.getName());
		holder.contactAvatar.setImageResource(R.drawable.ic_launcher);
		holder.message.setText(contact.getMessage());
		holder.contactTime.setText(contact.getContactTime());
		return convertView;
	}
	
	private class ViewHolder {
		public TextView contactName;
		public ImageView contactAvatar;
		public TextView message;
		public TextView contactTime;
	}

}
