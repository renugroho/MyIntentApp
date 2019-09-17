package ryo.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AkhirActivity extends AppCompatActivity {

    TextView textHasil;
    String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir);

        textHasil = findViewById(R.id.text_hasil);

        hasil = getIntent().getStringExtra("Data");
        textHasil.setText(hasil);

    }
}
