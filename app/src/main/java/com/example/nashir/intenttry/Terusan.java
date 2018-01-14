package com.example.nashir.intenttry;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;
import android.content.*;

/**
 * Created by Nashir on 14/01/2018.
 */

public class Terusan extends Activity{
    @Override
    public void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layar2);
        TextView text =(TextView)findViewById(R.id.textView);
        Button go =(Button)findViewById(R.id.button2);
        Intent baru=this.getIntent();
        text.setText("Ini adalah "+baru.getStringExtra("pesan"));

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
