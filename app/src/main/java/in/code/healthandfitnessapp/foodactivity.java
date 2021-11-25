package in.code.healthandfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class foodactivity extends AppCompatActivity {
//    ListView listView;
//    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodactivity);

//        String[] tstory = getResources().getStringArray(R.array.title_story);
//        final String[] dstory = getResources().getStringArray(R.array.detail_story);
//        listView = findViewById(R.id.list);
//        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.row,R.id.row_text,tstory);
//        listView.setAdapter(ad);
//
//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String t = dstory[position];
//                Intent intent = new Intent(foodactivity.this,foodactivitydetails.class);
//                intent.putExtra("story",t);
//                startActivity(intent);
//            }
//        });

    }

//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(foodactivity.this,MainActivity.class);
//        startActivity(intent);
//        finish();
//    }
//
//    public void foodgoback(View view) {
//        Intent intent = new Intent(foodactivity.this,MainActivity.class);
//        startActivity(intent);
//        finish();
//    }

}