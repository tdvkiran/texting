package com.example.texting;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void send(View v)
    {
    	LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
    	boolean a=false;
    	int i=1;
    	EditText e=(EditText) findViewById(R.id.editText1);
    	
    	if(e.getText().toString()!="")
    	 {
    	    TextView tv = new TextView(this);
    	    tv.setText(e.getText());
    	    tv.setId(i);
    	    ll.addView(tv);
    	    i++;
    	    e.setText("");
    	}
    }
}
