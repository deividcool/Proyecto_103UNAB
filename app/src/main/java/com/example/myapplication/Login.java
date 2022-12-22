package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.DB.DBFirebase;
import com.example.myapplication.Entidades.Producto;

public class Login extends AppCompatActivity {


    private Button btnForm;
    private EditText EditName, EditInfo, EditPrice;
    private DBFirebase dbFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    btnForm = (Button) findViewById(R.id.btnForm);
    EditName = (EditText) findViewById(R.id.EditName);
    EditInfo = (EditText) findViewById(R.id.EditInfo);
    EditPrice = (EditText) findViewById(R.id.EditPrice);
    dbFirebase = new DBFirebase();

    btnForm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Producto producto = new Producto(
                    EditName.getText().toString(),
                    EditInfo.getText().toString(),
                    Integer.parseInt(EditPrice.getText().toString()),
                    R.drawable.icon3
            );
            dbFirebase.inserData(producto);
            Intent intent= new Intent(getApplicationContext(),Catalogo.class);
            startActivity(intent);
        }
    });
    }
}