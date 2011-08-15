package com.shaastra;

import com.shaastra.adapters.IconifiedTextListAdapter;
import com.shaastra.types.IconifiedText;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class scheduletab extends Activity{
	
	private ListView ls1;
    private ListView ls2; 
	private ListView ls3;
    private ListView ls4; 
    
    
    
	@Override
	public void onCreate(Bundle icicle) {
	super.onCreate(icicle);
	final IconifiedTextListAdapter itla1 = new IconifiedTextListAdapter(this);
	 itla1.addItem(new IconifiedText("   Aerobotics","17:30 - 19:30", getResources().getDrawable(R.drawable.coding)));
	 final IconifiedTextListAdapter itla2 = new IconifiedTextListAdapter(this);
	 itla2.addItem(new IconifiedText("   Airshow","7:30-9:30", getResources().getDrawable(R.drawable.dept)));
	 final IconifiedTextListAdapter itla3 = new IconifiedTextListAdapter(this);   
itla3.addItem(new IconifiedText("   Topgun","7:30-9:30", getResources().getDrawable(R.drawable.design)));
final IconifiedTextListAdapter itla4 = new IconifiedTextListAdapter(this);   
itla4.addItem(new IconifiedText("   Topgun", "7:30-9:30",getResources().getDrawable(R.drawable.exhi)));
	
	 setContentView(R.layout.schedule3);
	ls1=(ListView) findViewById(R.id.eventlist);
	ls1.setAdapter(itla1);
	final TextView t1=(TextView)findViewById(R.id.day1);
	final TextView t2=(TextView)findViewById(R.id.day2);
	final TextView t3=(TextView)findViewById(R.id.day3);
	final TextView t4=(TextView)findViewById(R.id.day4);
	t1.setOnClickListener(new OnClickListener(){  
@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			t1.setBackgroundResource(R.drawable.backdayhighlight);
			t1.setTextColor(Color.WHITE);
	t2.setBackgroundResource(R.drawable.backday);
	t2.setTextColor(Color.BLACK);
	t3.setBackgroundResource(R.drawable.backday);
	t3.setTextColor(Color.BLACK);
	t4.setBackgroundResource(R.drawable.backday);
	t4.setTextColor(Color.BLACK);	
	ls1.setAdapter(itla1);
		}
});
		
	
	t2.setOnClickListener(new OnClickListener(){  
@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			t2.setBackgroundResource(R.drawable.backdayhighlight);
			t2.setTextColor(Color.WHITE);
			t1.setBackgroundResource(R.drawable.backday);
			t1.setTextColor(Color.BLACK);
			t3.setBackgroundResource(R.drawable.backday);
			t3.setTextColor(Color.BLACK);
			t4.setBackgroundResource(R.drawable.backday);
			t4.setTextColor(Color.BLACK);
			ls1.setAdapter(itla2);
		}
});
	
	t3.setOnClickListener(new OnClickListener(){  
@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			t3.setBackgroundResource(R.drawable.backdayhighlight);
			t3.setTextColor(Color.WHITE);
			ls1.setAdapter(itla3);
			t2.setBackgroundResource(R.drawable.backday);
			t2.setTextColor(Color.BLACK);
			t1.setBackgroundResource(R.drawable.backday);
			t1.setTextColor(Color.BLACK);
			t4.setBackgroundResource(R.drawable.backday);
			t4.setTextColor(Color.BLACK);	
}
});
	t4.setOnClickListener(new OnClickListener(){  
		@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					t4.setBackgroundResource(R.drawable.backdayhighlight);
					t4.setTextColor(Color.WHITE);
					t2.setBackgroundResource(R.drawable.backday);
					t2.setTextColor(Color.BLACK);
					t3.setBackgroundResource(R.drawable.backday);
					t3.setTextColor(Color.BLACK);
					t1.setBackgroundResource(R.drawable.backday);
					t1.setTextColor(Color.BLACK);
					ls1.setAdapter(itla4);
				}
		});
	}
	
}
	








/*
//ls1 = new ListView(scheduletab.this); 
	//ls2 = new ListView(scheduletab.this); 
	//ls3 = new ListView(scheduletab.this); 
	//ls4 = new ListView(scheduletab.this); 
	//ArrayAdapter<String> adapter = new ArrayAdapter<String>(scheduletab.this,R.layout.simplelistitem,new String[]{"Day 1","Day 2","Day 3"});

	//Gallery gallery = (Gallery) findViewById(R.id.galleryday);
	
 	//textboxadapter t=new textboxadapter(this);
	//gallery.setAdapter(t); 
	//gallery.getFirstVisiblePosition();
	//TabHost tabs = (TabHost) this.findViewById(R.id.my_tabhost);
	//tabs.setup();
	
     
    
     

	/*TabSpec tspec1 = tabs.newTabSpec("one");
	tspec1.setIndicator("Day 1");
	
	tspec1.setContent(new TabHost.TabContentFactory(){

	                        public View createTabContent(String tag)

	                        {                                                                      
	
	                                //ArrayAdapter<String> adapter = new ArrayAdapter<String>(scheduletab.this,R.layout.simplelistitem,new String[]{"item1","item2","item3"});
	                                ls1.setAdapter(itla);       
	                                return ls1;
                     }              
	
	                });  
	
	tabs.addTab(tspec1);
	TabSpec tspec2 = tabs.newTabSpec("two");
	tspec2.setIndicator("Day 2");
	tspec2.setContent(new TabHost.TabContentFactory(){

        public View createTabContent(String tag)

        {                                                                      

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(scheduletab.this,R.layout.simplelistitem,new String[]{"item4","item5","item6"});
                ls2.setAdapter(adapter);       
                return ls2;
 }              

});   
	tabs.addTab(tspec2);
	TabSpec tspec3 = tabs.newTabSpec("three");
	tspec3.setIndicator("Day 3");
	tspec3.setContent(new TabHost.TabContentFactory(){

        public View createTabContent(String tag)

        {                                                                      

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(scheduletab.this,R.layout.simplelistitem,new String[]{"item7","item8","item9"});
                ls3.setAdapter(adapter);       
                return ls3;
 }              

}); 
	tabs.addTab(tspec3);
	TabSpec tspec4 = tabs.newTabSpec("four");
	tspec4.setIndicator("Day 4");
	tspec4.setContent(new TabHost.TabContentFactory(){

        public View createTabContent(String tag)

        {                                                                      

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(scheduletab.this,R.layout.simplelistitem,new String[]{"item10","item11","item12"});
                ls4.setAdapter(adapter);       
                return ls4;
 }              

}); 
	tabs.addTab(tspec4);

*/