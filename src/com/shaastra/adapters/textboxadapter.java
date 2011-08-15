package com.shaastra.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.TextView;

import com.shaastra.R;

public class textboxadapter extends BaseAdapter {
	
	String[] days = {
           "Day 1",
           "Day 2",
           "Day 3",
           "Day 4"
    };
	 private Context context;
     private int itemBackground;

     public textboxadapter(Context c) 
     {
         context = c;
         //---setting the style---
         TypedArray a = context.obtainStyledAttributes(R.styleable.Gallery1);
         itemBackground = a.getResourceId(
        		 R.drawable.gallery_selected_default
            , 1);
         a.recycle();                    
     }

     //---returns the number of images---
     public int getCount() {
         return days.length;
     }

     //---returns the ID of an item--- 
     public Object getItem(int position) {
         return position;
     }            

     public long getItemId(int position) {
         return position;
     }

     //---returns an ImageView view---
     public View getView(int position, View convertView, ViewGroup parent) {
        // ImageView imageView = new ImageView(context);
    	 
    	 TextView t =new TextView(context);
    	t.setText(days[position]);
       t.setGravity(Gravity.CENTER);
       t.setTextSize(17);
       t.setTextColor(Color.BLACK);
     //  Typeface font1 = Typeface.createFromAsset(getAssets(), "Ubuntu.ttf");
       
       t.setLayoutParams(new Gallery.LayoutParams(130, 40));
         t.setBackgroundResource(R.drawable.backday);
     
       return t;
     }
 }    


