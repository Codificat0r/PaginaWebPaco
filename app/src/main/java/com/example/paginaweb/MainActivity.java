package com.example.paginaweb;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        String url = edtUrl.getText().toString();
        if (v == btnExplorador) {
            if (URLUtil.isValidUrl(url) && (URLUtil.isHttpsUrl(url) || URLUtil.isHttpUrl(url))) {
                Intent intent = new Intent(this, VisorWeb.class);
                Bundle bundle = new Bundle();
                bundle.putString("url", edtUrl.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            } else {
                Toast.makeText(this, "La URL no es correcta.", Toast.LENGTH_LONG).show();
            }
        }
    }
}
