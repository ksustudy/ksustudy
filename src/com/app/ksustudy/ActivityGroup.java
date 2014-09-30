package com.app.ksustudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityGroup extends Activity {

	GridView gvMain; 
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_group);
		
		gvMain = (GridView) findViewById(R.id.gridView1);
        gvMain.setAdapter(new ImageAdapterGroup(this));
        
        
        gvMain.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
			}
        	
        });
	 }
}
