package com.example.latihanquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz1 extends Activity{
	
	EditText a1,a2;
	Button b3;
	TextView thasil;
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
        
        a1=(EditText)findViewById(R.id.angka1);
        a2=(EditText)findViewById(R.id.angka2);
        b3=(Button)findViewById(R.id.btn3);
        thasil=(TextView)findViewById(R.id.tvhasil);
        
        
        b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int bil1=Integer.parseInt(a1.getText().toString());
				int bil2=Integer.parseInt(a2.getText().toString());
				
				if(bil1 > bil2){
					thasil.setText("Bilangan 1 lebih besar dari bilangan 2");
					
				}
				else if (bil1 == bil2) {
					thasil.setText("bilangan 1 dan 2 sama");
				
				}
				else{
				    thasil.setText("bilangan 2 lebil besar dari bilangan 1");
				}
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
