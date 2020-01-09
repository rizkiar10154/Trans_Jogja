package com.example.transjogja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.BusViewHolder>{

    private ArrayList<Bus> dataList;

    BusAdapter(ArrayList<Bus> dataList){
            this.dataList = dataList;
    }


    @Override
        public BusViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new BusViewHolder(view);
    }

    @Override
        public void onBindViewHolder(BusViewHolder holder, int position){
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtRute.setText(dataList.get(position).getRute());
    }

    @Override
    public int getItemCount(){
            return(dataList != null)? dataList.size() :0;
    }

    class BusViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNama, txtRute;

            BusViewHolder(View item_list){
                    super(item_list);
                    txtNama= item_list.findViewById(R.id.txt_nama_bus);
                    txtRute= item_list.findViewById((R.id.txt_rute));
            }
    }
}

    //fungsi Adapter : Untuk mengatur bagaimana data dari data model akan ditampilkan akan ditampilkan di RecyclerView sebagai sebuah single item
