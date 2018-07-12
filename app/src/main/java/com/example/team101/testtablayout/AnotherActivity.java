package com.example.team101.testtablayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zhangyu on 2018/7/9.
 */

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                gotoMainActivity();
            }

        });
    }

    public void gotoMainActivity(){
        Intent intent = new Intent(AnotherActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
