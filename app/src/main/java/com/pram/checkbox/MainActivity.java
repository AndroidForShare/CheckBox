package com.pram.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbCheckOne, cbCheckTwo;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbCheckOne = (CheckBox) findViewById(R.id.cbCheckOne);
        cbCheckTwo = (CheckBox) findViewById(R.id.cbCheckTwo);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbCheckOne.isChecked() && cbCheckTwo.isChecked()) {
                    Toast.makeText(MainActivity.this, "cbCheckOne is Checked\ncbCheckTwo is Checked", Toast.LENGTH_SHORT).show();
                } else if (cbCheckOne.isChecked()) {
                    Toast.makeText(MainActivity.this, "cbCheckOne is Checked", Toast.LENGTH_SHORT).show();
                } else if (cbCheckTwo.isChecked()) {
                    Toast.makeText(MainActivity.this, "cbCheckTwo is Checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Nothing is Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
