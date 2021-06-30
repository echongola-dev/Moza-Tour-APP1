package com.ezc.moza_tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class LocalFragment extends Fragment {


    ArrayAdapter<Local>  adapter;
    private Object Menu;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = this.getLayoutInflater().inflate((R.layout.fragment_local), null);

        ArrayList<Local> lista = new ArrayList<>();

        lista.add(new Local("Estacao de Trem - CFM", "Praca dos Prabalhadores", -25.9702659, 32.5649411));
        lista.add(new Local("Jardim Botânico Tunduro", "Av. Samora Machel", -25.9707699, 32.5723805));
        lista.add(new Local("Pavilhão do Desportivo", "Av. Zedequias Manganhela", -25.9749873, 32.5751353));
        lista.add(new Local("Radisson Blu Hotel & Residence", "Av. da Marginal", -25.9557354, 32.6048493));
        lista.add(new Local("Mercado Xipamanine", "Rua de Xipamanine", -25.9445654, 32.563538));
        lista.add(new Local("PONTA VIEW HOTEL PONTA DO OURO", "Lopes", -26.8334931, 32.8768606));

        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, lista);

        ListView lv = view.findViewById(R.id.lv);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((parent, view1, position, id) -> {
            Intent i = new Intent(getActivity(), MapsActivity.class);
            i.putExtra("latitude", lista.get(position).latitude);
            i.putExtra("longitude", lista.get(position).longitude);
            i.putExtra("titulo", lista.get(position).titulo);
            startActivity(i);
        });
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull  Menu menu, @NonNull  MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);


        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull  MenuItem item) {
        int id = item.getItemId();;

        if (id == R.id.pesquisar){
            Toast.makeText(getActivity(), "pesquisar", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}