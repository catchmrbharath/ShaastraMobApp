package com.shaastra;


import com.shaastra.adapters.EventAdapter;
import com.shaastra.views.EventImage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class main2 extends Activity {
	
	private EventImage[] events;
private int position=0;
	gallerymanager sources;
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	    	        super.onCreate(savedInstanceState);
	    	        sources=new gallerymanager();
	    	        setContentView(R.layout.main2);
	    		     initialisegalleries();
}
	  
	    void initialisegalleries()
	    {
	    
	    	 Gallery gallery = (Gallery) findViewById(R.id.gallerycat);
	    	 EventAdapter e=new EventAdapter(this,-1);
			 gallery.setAdapter(e); 
			 final Gallery eventg=(Gallery) findViewById(R.id.galleryeve);
			 gallery.setOnItemClickListener(new OnItemClickListener() 
		        {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// TODO Auto-generated method stub
						position=arg2;
						 EventAdapter e=new EventAdapter(main2.this,arg2);
						 eventg.setAdapter(e);
					}
		        });
			 eventg.setOnItemClickListener(new OnItemClickListener() 
		        {
					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// TODO Auto-generated method stub
					    Intent i = new Intent(main2.this,TestActivity.class);
					    Bundle b = new Bundle();
					    gallerymanager g=new gallerymanager();
					    b.putInt("valueid", g.eventids[position][arg2]);
					  
					    b.putString("valuecategory", "Shaastra impact");
					    i.putExtras(b);
					    startActivity(i);		
					}
		        });
	    }
	    
}