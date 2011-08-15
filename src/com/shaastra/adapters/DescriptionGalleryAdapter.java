package com.shaastra.adapters;
import org.w3c.dom.Text;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Gallery.LayoutParams;

import com.shaastra.R;

public class DescriptionGalleryAdapter extends BaseAdapter 
    {
        private Context context;
        private int   itemBackground;
    	private int eventId;
    	private DatabaseHelper mDatabaseHelper;
    	private Cursor mCursor;
    	private String[] mTitles;
    	private int length;
        private LayoutInflater mLayoutInflator;                        
    	
    	

        public DescriptionGalleryAdapter(Context c,int eventId) 
        {
            context = c;
            this.eventId = eventId;
            mLayoutInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            TypedArray a = context.obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(
            R.styleable.Gallery1_android_galleryItemBackground, 0);
            a.recycle();
            mDatabaseHelper = new DatabaseHelper(c);
            mDatabaseHelper.openDataBase();
            mCursor = mDatabaseHelper.fetchDescription(eventId);
            length=0;
            if(mCursor!=null){
            	Log.v("database", "no record");
            
            
            length = mCursor.getCount();
            mTitles = new String[length];
            for(int i=0;i<length;i++){
            	mTitles[i] = mCursor.getString(1);
            	mCursor.moveToNext();
            }
            }
        }
            
            
        
        public DescriptionGalleryAdapter(Context c){
        	this(c,1);
        }

        
        public int getCount() {
            return length;
        }

       
        public Object getItem(int position) {
            return position;
        }            

        public long getItemId(int position) {
            return position;
        }

 @Override
        public View getView(int position, View convertView, ViewGroup parent) {
	 		TextView titleView = null;
	 		if(convertView==null){
	 			convertView = mLayoutInflator.inflate(R.layout.gallery_text_view,null);
	 			titleView = (TextView) convertView.findViewById(R.id.perioxi_select);
	 			
	 			convertView.setTag(titleView);
	 		}
	 		else{
	 			titleView = (TextView) convertView.getTag();
	 			
	 		}
	 		titleView.setText(mTitles[position]);
	 		return convertView;
	 		
            
            
  
	 
    
 
 }
    }
    


    
 
