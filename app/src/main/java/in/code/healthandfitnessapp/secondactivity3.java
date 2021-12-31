package in.code.healthandfitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class secondactivity3 extends AppCompatActivity {
    Toolbar toolbar;
    int[] arr = {R.id.id1,R.id.id2,R.id.id3,R.id.id4,R.id.id5,R.id.id6,R.id.id7,R.id.id8,R.id.id9,R.id.id10,R.id.id11,
            R.id.id12,R.id.id13,R.id.id14,R.id.id15,R.id.id16,R.id.id17,R.id.id18,R.id.id19,R.id.id20,R.id.id21,
            R.id.id22,R.id.id23,R.id.id24,R.id.id25,R.id.id26,R.id.id27,R.id.id28,R.id.id29,R.id.id30,
            R.id.id31,R.id.id32,R.id.id33,R.id.id34,R.id.id35,R.id.id36,R.id.id37,R.id.id38,R.id.id39,
            R.id.id40,R.id.id41,R.id.id42,R.id.id43,R.id.id44,R.id.id45};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity3);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.user){



            return true;
        }

        if(id == R.id.bmi){



            return true;
        }
        if(id == R.id.remainder){



            return true;
        }
        if(id == R.id.stopwatch){



            return true;
        }
        if(id == R.id.share){



            return true;
        }

        return true;
    }



    private void setSupportActionBar(Toolbar toolbar) {
    }

    public void Imagebuttonclick(View view) {

        for(int i=0;i< arr.length;i++){
            if(view.getId()==arr[i]){
                int value = i+1;
                Log.i("First",String.valueOf(value));
                Intent intent = new Intent(secondactivity3.this,thirdactivity3.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}