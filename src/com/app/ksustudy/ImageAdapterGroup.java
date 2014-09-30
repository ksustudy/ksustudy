package com.app.ksustudy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterGroup extends BaseAdapter {
	private Context mContext;
	
	public ImageAdapterGroup(Context c) {
		mContext = c;
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return mThumbIds[position];
	}

	public long getItemId(int position) {
		return position;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if (convertView == null) {
			// if it's not recycled, initialize some attributes
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(100, 160));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(3, 3, 3, 3);
		} else {
			imageView = (ImageView) convertView;
		}

		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}

	// references to our images
	public	Integer[] mThumbIds = { R.drawable.abs_eg, R.drawable.abs_one, R.drawable.abs_two,
			R.drawable.abs_three, R.drawable.abs_four, R.drawable.abs_five, R.drawable.abs_six,
			R.drawable.abs_seven };

}
