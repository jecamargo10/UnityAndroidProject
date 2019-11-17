package com.javier.javi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class InictialActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Log.e("asd","xxx") ;
Button soporteButton = (Button) findViewById(R.id.button);
        soporteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Iniciar salgo
                Log.e("asd","CLICK") ;

                Intent intent = new Intent(InictialActivity.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });

    }
}
