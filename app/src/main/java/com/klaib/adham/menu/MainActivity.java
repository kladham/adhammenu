package com.klaib.adham.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnitmscreen1:
                Toast.makeText(getBaseContext(),"hi....Screen1",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getBaseContext(),page2.class);
                startActivity(intent);
                break;
            case R.id.mnitmscreen2:
                Toast.makeText(getBaseContext(),"hi....Screen2",Toast.LENGTH_LONG).show();
                Intent intent1=new Intent(getBaseContext(),page5.class);
                startActivity(intent1);
                break;
            case R.id.mnitmscreen3:
                Toast.makeText(getBaseContext(),"hi....Screen3",Toast.LENGTH_LONG).show();
                Intent intent2=new Intent(getBaseContext(),page4.class);
                startActivity(intent2);
                break;
            case R.id.mnitmscreen4:
                Toast.makeText(getBaseContext(),"hi....Screen4",Toast.LENGTH_LONG).show();
                Intent intent3=new Intent(getBaseContext(),page3.class);
                startActivity(intent3);
                break;
        }
        return true;
    }
}

