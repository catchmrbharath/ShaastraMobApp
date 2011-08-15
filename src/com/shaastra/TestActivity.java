package com.shaastra;


import java.io.IOException;

import com.shaastra.adapters.DatabaseHelper;
import com.shaastra.views.SegmentedControlButton;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class TestActivity extends Activity {
	private int eventId;
	private DatabaseHelper myDbHelper;
	private Cursor mCursor;
	private String title;
	private String category;
	private String mDescription;
	private TextView mDescriptionTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myDbHelper = new DatabaseHelper(this);
		try{
			myDbHelper.createDataBase();
		
			
		}
		catch (IOException ioe){
			throw new Error("database not created");
		}
		eventId = 1;
		setContentView(R.layout.description_activity);
		  Bundle extras = getIntent().getExtras();
	        if (extras != null) {
	        	gallerymanager g=new gallerymanager();
	        	eventId=extras.getInt("valueid");
	            title=g.eventNameHash.get(eventId);
	            category=extras.getString("valuecategory");
	       TextView t=(TextView)findViewById(R.id.event_category);
	       t.setText(title);
	      // t=(TextView)findViewById(R.id.eventName);
	       //t.setText(title);
	       ImageView i=(ImageView)findViewById(R.id.event_image);
	       i.setImageResource(g.imageIDs[eventId-1]);
	        }
	       
	        mDescriptionTextView = (TextView) findViewById(R.id.eventDescription);
	     
		RadioGroup segmentControl = (RadioGroup) findViewById(R.id.segmented_control);
		HorizontalScrollView scrollView = (HorizontalScrollView) findViewById(R.id.SegmentedScrollView);
		scrollView.setHorizontalScrollBarEnabled(false);
		myDbHelper.openDataBase();
		mCursor = myDbHelper.fetchDescription(eventId);
		 int length = mCursor.getCount();
		for(int i=0;i<length;i++){
		SegmentedControlButton temp = new SegmentedControlButton(this); 
		temp.setText(mCursor.getString(1));
		
		segmentControl.addView(temp);
		mCursor.moveToNext();
		}
		
		segmentControl.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				for (int i=0;i<group.getChildCount();i++)
				{
					SegmentedControlButton btn = (SegmentedControlButton) group.getChildAt(i);
					if(btn.getId() == checkedId){
						String text = (String) btn.getText();
						Cursor tempCursor = myDbHelper.fetchDescription(eventId,text);
						mDescription = tempCursor.getString(2);
						mDescriptionTextView.setMovementMethod(new ScrollingMovementMethod());
						mDescriptionTextView.setText(mDescription);
						
						
					}
					
				}
			
				
				
			}
		});
		SegmentedControlButton temp = (SegmentedControlButton) segmentControl.getChildAt(0);
		temp.setChecked(true);
	}
}


