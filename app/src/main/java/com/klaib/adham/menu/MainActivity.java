package com.klaib.adham.menu;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btndate;
    private TextView tvshowdate;
    private Object calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndate= (Button) findViewById(R.id.btndate);
        tvshowdate= (TextView) findViewById(R.id.tvshowdate);
        btndate.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
       getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
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
    @Override
    public void onClick(View view)
    {
        if (view=btndate)
        {
            //to get current date
            Calendar c= Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            final int day=c.get(Calendar.DAY_OF_MONTH);
            //building data dialog
            DatePickerDialog.OnDateSetListener dateListner=new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tvshowdate.setText(dayOfMonth+"/"+month+"/"+year+);

                }
            };
            DatePickerDialog datePickerDialog=new DatePickerDialog(this,dateListner,year,month,day);





        }


    }
}

