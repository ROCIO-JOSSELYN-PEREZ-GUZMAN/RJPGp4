package com.example.rjpgp4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class contenido extends BaseAdapter {
    Context contexto;
    ArrayList<String> arreglo;

    public contenido(Context contexto, ArrayList<String> arreglo) {
        this.contexto = contexto;
        this.arreglo = arreglo;
    }


    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int position) {
        return arreglo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            LayoutInflater layoutInflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.activity_frm2,null);
        }
        TextView txtTitulo= convertView.findViewById(R.id.txtTitulo);
        txtTitulo.setText(arreglo.get(position));
        return convertView;
    }
}

