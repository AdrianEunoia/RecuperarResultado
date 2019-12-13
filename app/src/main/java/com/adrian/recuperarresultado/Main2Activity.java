package com.adrian.recuperarresultado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button idresponder;
    private EditText idedittext;
    static final String TAG_RES = "Resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }
    private void acciones(){
        idresponder.setOnClickListener(this);
    }

    private void instancias(){
        idresponder = findViewById(R.id.idresponder);
        idedittext = findViewById(R.id.idedittext);
    }

    @Override
    public void onClick(View v) {
        if(idedittext.getText().toString().isEmpty()){
            setResult(MainActivity.RES_CODE_FAIL);
        }else{
            Intent intent = new Intent();
            intent.putExtra(TAG_RES,idedittext.getText().toString());
            setResult(MainActivity.RES_CODE_OK);
            finish();
        }
    }
}
