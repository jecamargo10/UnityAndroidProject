package com.javier.javi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FirstGameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
       /* Button soporteButton = (Button) findViewById(R.id.button2);
        soporteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Iniciar salgo

              //  Intent intent = new Intent(InictialActivity.this, UnityPlayerActivity.class);
               // startActivity(intent);
            }
        });

**/
    }
}
