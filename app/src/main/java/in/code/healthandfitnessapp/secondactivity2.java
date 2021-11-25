package in.code.healthandfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toolbar;

public class secondactivity2 extends AppCompatActivity {
    Toolbar toolbar;
    int[] arr = {R.id.id1,R.id.id2,R.id.id3,R.id.id4,R.id.id5,R.id.id6,R.id.id7,R.id.id8,R.id.id9,R.id.id10,R.id.id11,R.id.id12,R.id.id13,R.id.id14,R.id.id15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    public void Imagebuttonclick(View view) {

        for(int i=0;i< arr.length;i++){
            if(view.getId()==arr[i]){
                int value = i+1;
                Log.i("First",String.valueOf(value));
                Intent intent = new Intent(secondactivity2.this,thirdactivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}