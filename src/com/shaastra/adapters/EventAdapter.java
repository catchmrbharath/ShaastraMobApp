package com.shaastra.adapters;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


import com.shaastra.R;
import com.shaastra.gallerymanager;
import com.shaastra.views.EventImage;

public class EventAdapter extends BaseAdapter 
    {
        private Context context;
        private int   itemBackground;
    	private EventImage[] events;
gallerymanager sources=new gallerymanager();
    	private int galleryId;
private eventdatabaseHelper helper;
        public EventAdapter(Context c,int eventId) 
        {
        	
            context = c;
            this.galleryId = eventId;
            TypedArray a = context.obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(
            R.styleable.Gallery1_android_galleryItemBackground, 0);
            a.recycle();                    
        }
        public EventAdapter(Context c){
        	this(c,0);
        }

        
        public int getCount() {
          if (galleryId!=-1)
        	return sources.eventids[galleryId].length;
          else
        	  return sources.catIds.length;
        }

       
        public Object getItem(int position) {
            return position;
        }            

        public long getItemId(int position) {
            return position;
        }

 @Override
        public View getView(int position, View convertView, ViewGroup parent) {
	       // Typeface font1 = Typeface.createFromAsset(context.getAssets(), "Arcane Italic.ttf");       
	        EventImage eventView = new EventImage(context);
	        if(galleryId!=-1)
	        {
            eventView.setImageResource(sources.imageIDs[sources.eventids[galleryId][position]-1]);
            eventView.eventImage.setScaleType(ImageView.ScaleType.FIT_XY);
            eventView.setLayoutParams(new Gallery.LayoutParams(150, 120));
            eventView.setBackgroundResource(R.drawable.gallery_selected_default);
           // eventView.setBackgroundResource(R.drawable.gradient2);
           eventView.eventNameView.setText(sources.eventNameHash.get(sources.eventids[galleryId][position]));
          
           //eventView.eventNameView.setTypeface(font1);
            return eventView;
	        }
	        else
	        {
	        	 eventView.setImageResource(sources.catIds[position]);
	             eventView.eventImage.setScaleType(ImageView.ScaleType.FIT_XY);
	             eventView.setLayoutParams(new Gallery.LayoutParams(150, 120));
	             eventView.setBackgroundResource(R.drawable.gallery_selected_default);
	           
	             return eventView;
	        }
			
	         
	 }

    } 
    
 
