package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.myapplication.Adaptadores.ProductoAdapter;
import com.example.myapplication.DB.DBFirebase;
import com.example.myapplication.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private DBFirebase dbFirebase;
    private ListView list_view_productos;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);


        list_view_productos = (ListView) findViewById(R.id.list_view_productos);
        arrayProductos = new ArrayList<>();
        dbFirebase = new DBFirebase();







        productoAdapter = new ProductoAdapter(this,arrayProductos);
        list_view_productos.setAdapter(productoAdapter);

        dbFirebase.getData(productoAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.addItem:
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}