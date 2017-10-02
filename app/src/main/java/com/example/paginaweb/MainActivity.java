package com.example.paginaweb;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtUrl;
    private Button btnExplorador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUrl = (EditText)findViewById(R.id.edtUrl);
        btnExplorador = (Button)findViewById(R.id.btnExplorador);

        btnExplorador.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnExplorador) {
            Uri uri = Uri.parse(edtUrl.getText().toString());
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}
