package com.thehp.task0;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen);
	}
	
	public void Jumble(View view)
	{
		TextView tv=(TextView) findViewById(R.id.txtv_helloworld);
		String word=tv.getText().toString();
		StringBuilder builder = new StringBuilder(word.length());
	    boolean[] used = new boolean[word.length()];
	    
	    for (int i = 0; i < word.length(); i++) {
	        int rndIndex;
	        do {
	            rndIndex = new Random().nextInt(word.length());
	        } while (used[rndIndex]);
	        used[rndIndex] = true;
	            
	        builder.append(word.charAt(rndIndex));
	    }
	    tv.setText(builder.toString());
	}
	
	

}
