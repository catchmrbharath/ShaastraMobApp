package com.shaastra;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;


public class GalleryClickListener implements OnItemClickListener {
	int galleryNumber;
	Context context;
	public GalleryClickListener(int rowNumber,Context context)
	{
		super();
		this.galleryNumber = rowNumber;
		this.context = context;
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		 Intent i = new Intent(context,TestActivity.class);
		    Bundle b = new Bundle();
		    gallerymanager g=new gallerymanager();
		    b.putInt("valueid", g.eventids[galleryNumber][arg2]);
		  
		    b.putString("valueCategory", g.eventNameHash.get(g.eventids[galleryNumber][arg2]));
		    i.putExtras(b);
		    context.startActivity(i);	
	
		
		
	}

}
