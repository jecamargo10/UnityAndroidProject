package com.javier.javi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button soporteButton = (Button) findViewById(R.id.button2);
        soporteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Iniciar salgo

                Intent intent = new Intent(MenuActivity.this, FirstGameActivity.class);
               startActivity(intent);
            }
        });


    }
}
