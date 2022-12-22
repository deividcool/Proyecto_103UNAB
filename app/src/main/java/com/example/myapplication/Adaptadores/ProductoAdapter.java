package com.example.myapplication.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Entidades.Producto;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ProductoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Producto>arrayProducto;

    public ProductoAdapter(Context context, ArrayList<Producto> arrayProducto) {
        this.context = context;
        this.arrayProducto = arrayProducto;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Producto> getArrayProducto() {
        return arrayProducto;
    }

    public void setArrayProducto(ArrayList<Producto> arrayProducto) {
        this.arrayProducto = arrayProducto;
    }

    @Override
    public int getCount() {
        return arrayProducto.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducto.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater= LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.producto_template,  null);

        ImageView img_Product = (ImageView) view.findViewById(R.id.img_Product);
        TextView text_product_tittle = (TextView) view.findViewById(R.id.text_product_tittle);
        TextView text_product_price = (TextView) view.findViewById(R.id.text_product_price);

        Producto producto = arrayProducto.get(i);


        img_Product.setImageResource(producto.getImage());
        text_product_tittle.setText(producto.getName());
        text_product_price.setText(producto.getPrice());

        return view;
    }
}
