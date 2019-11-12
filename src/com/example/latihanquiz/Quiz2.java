package com.example.latihanquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz2 extends Activity{ 
	
	EditText a3,a4,a5;
	Button b4;
	TextView thasil2;
	
	
	@Override

    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz2);
		
	a3=(EditText)findViewById(R.id.angkaa);
	a4=(EditText)findViewById(R.id.angkab);
	a5=(EditText)findViewById(R.id.angkac);
	b4=(Button)findViewById(R.id.tombol1);
	thasil2=(TextView)findViewById(R.id.thasil);
	
	b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int bill3=Integer.parseInt(a3.getText().toString());
			int bill4=Integer.parseInt(a4.getText().toString());
			int bill5=Integer.parseInt(a5.getText().toString());
			
			if(bill3>bill4 && bill4>bill5){
				thasil2.setText("Bilangan a adalah paling besar dan bilangan c terkecil");
			}
			else if (bill3>bill4 && bill4<bill5){
				thasil2.setText("Bilangan a adalah paling besar dan bilangan b terkecil");
			}
			else if (bill4>bill3 && bill3>bill5) {
				thasil2.setText("bilangan b adalah paling besar dan bilangan c terkecil");
			}
			else if (bill4>bill3 && bill3<bill5) {
				thasil2.setText("bilangan b adalah paling besar dan bilangan a terkecil");
			}
			else if (bill5>bill3 && bill3<bill4) {
				thasil2.setText("bilangan c adalah paling besar dan bilangan a terkecil");
			}
			else   {
				thasil2.setText("bilangan c adalah paling besar dan bilangan b terkecil");
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
