package in.code.healthandfitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,secondactivity2.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,secondactivity3.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater  = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
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

    public void Beginner(View view) {
        Intent intent = new Intent(MainActivity.this, secondactivity.class);
        startActivity(intent);
    }

    public void Intermediate(View view) {
        Intent intent = new Intent(MainActivity.this,secondactivity2.class);
        startActivity(intent);
    }

    public void Advanced(View view) {
        Intent intent = new Intent(MainActivity.this,secondactivity3.class);
        startActivity(intent);
    }
    public void food(View view) {
        Intent intent = new Intent(MainActivity.this,foodactivity.class);
        startActivity(intent);
    }
}