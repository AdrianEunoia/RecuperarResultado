package com.adrian.recuperarresultado;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button idpasar;
    private TextView idtextview;
    final static int REQ_CODE = 1;
    final static int RES_CODE_OK = 1;
    final static int RES_CODE_FAIL = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }
    private void acciones(){
        idpasar.setOnClickListener(this);
    }

    private void instancias(){
        idpasar = findViewById(R.id.idpasar);
        idtextview = findViewById(R.id.idtextview);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_CODE && resultCode == RES_CODE_OK){
            String Resultado = (String) data.getExtras().get(Main2Activity.TAG_RES);
            idtextview.setText(Resultado);
        }else if(requestCode == REQ_CODE && resultCode == RES_CODE_FAIL){
            idtextview.setText("No se han podido pasar datos");
        }
    }

    @Override
    public void onClick(View v) {
        Intent primerIntent = new Intent(getApplicationContext(), Main2Activity.class);
        //segundoIntent.putExtra(TAG_1,nombrePersona);
        startActivityForResult(primerIntent, REQ_CODE);
    }
}
