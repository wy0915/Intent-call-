package com.c.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.activity_main_call_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri numeber = Uri.parse("tel:123445556");
                Intent callIntent = new Intent(Intent.ACTION_DIAL,numeber);
                Intent chooser = Intent.createChooser(callIntent, "请选择");
                if ((chooser.resolveActivity(getPackageManager()))!=null){
                startActivity(chooser);}
            }
        });
    }
}
