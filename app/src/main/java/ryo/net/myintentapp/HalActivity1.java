package ryo.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HalActivity1 extends AppCompatActivity {

    Button btnhal;
    EditText edithal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        edithal = findViewById(R.id.edit_text);

        btnhal = findViewById(R.id.btn_akhir);
        btnhal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = edithal.getText().toString();
                startActivity(new Intent(HalActivity1.this, AkhirActivity.class).putExtra("Data", data));
            }
        });
    }
}
