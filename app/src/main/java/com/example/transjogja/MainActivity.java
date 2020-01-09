package com.example.transjogja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;
    protected BusAdapter adapter;
    private ArrayList< Bus >BusArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

            recyclerView = findViewById(R.id.recycler_view);

            adapter = new BusAdapter(BusArrayList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adapter);
    }

        //Fungsi untuk menambahkan data
    void addData(){
            BusArrayList = new ArrayList<>();
            BusArrayList.add(new Bus("Jalur 1A","Prambanan-RS Bhayangkara"));
            BusArrayList.add(new Bus("Jalur 1B","Bandara AdiSucipto - Jl.Solo (Alfa)"));
            BusArrayList.add(new Bus("Jalur 2A","Terminal Jombor - Ringroad Utara(Monjali 2)"));
            BusArrayList.add(new Bus("Jalur 2B","Terminal Jombor - Ringroad Utara(Monjali 2)"));
            BusArrayList.add(new Bus("Jalur 3A","Terminal Giwangan - Port.Pasar Giwangan"));
            BusArrayList.add(new Bus("Jalur 3B","Terminal Giwangan"));
            BusArrayList.add(new Bus("Jalur 5B","Terminal Jombor - Suzuki Jl.Magelang(JCM)"));
            BusArrayList.add(new Bus("Jalur7","Giwangan - Port.Ps Giwangan 1" ));
            BusArrayList.add(new Bus("Jalur 8","Jombor - UTY Ringroad Utara 2"));
            BusArrayList.add(new Bus("Jalur 9","Giwangan - UAD Ringroad Selatan 1"));
            BusArrayList.add(new Bus("Jalur 10","Gamping - Port. UMY 1"));
            BusArrayList.add(new Bus("Jalur 11"," Port. UAD Ringroad Selatan 1"));
            BusArrayList.add(new Bus("Jalur 6A","Gamping - UMY 1"));
            BusArrayList.add(new Bus("Jalur 6B","Gamping - Ruko Bayeman 2"));



    }
}
