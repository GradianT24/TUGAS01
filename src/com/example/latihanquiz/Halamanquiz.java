package com.example.latihanquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Halamanquiz extends Activity{

	Button tombolsatu, tomboldua;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
    
        tombolsatu=(Button)findViewById(R.id.btnquiz1);
        tomboldua=(Button)findViewById(R.id.btnquiz2);
        
        tombolsatu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intentsatu = new Intent (Halamanquiz.this,Quiz1.class);
				startActivity(intentsatu);
			}
		});
        
        tomboldua.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intentdua = new Intent (Halamanquiz.this,Quiz2.class);
				startActivity(intentdua);
			}
		});
        
}

	
	
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
}
