package com.example.android.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView resto;
    private TextView makanan;
    private TextView amount;
    private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String porsix = intent.getStringExtra("porsi");
        String tempatx = intent.getStringExtra("tempat");
        String menux = intent.getStringExtra("menu");
        String hargax = intent.getStringExtra("harga");

        int total = Integer.valueOf(porsix)*Integer.valueOf(hargax);

        resto = (TextView)findViewById(R.id.tempath);
        resto.setText(tempatx);

        makanan = (TextView)findViewById(R.id.menuh);
        makanan.setText(menux);

        amount = (TextView)findViewById(R.id.porsih);
        amount.setText(porsix);

        price = (TextView)findViewById(R.id.hargah);
        price.setText(String.valueOf(total));

        if (total>= 100000){
            Toast toast1 = Toast.makeText(this, R.string.toast_message1, Toast.LENGTH_LONG);
            toast1.show();
        }else {
            Toast toast2 = Toast.makeText(this, R.string.toast_message2, Toast.LENGTH_LONG);
            toast2.show();
        }
    }
}
