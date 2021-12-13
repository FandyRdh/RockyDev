package com.exampel.uas_pm1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Pelajaran1Adapter extends RecyclerView.Adapter<Pelajaran1Adapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<pelajaran1> list_item = new ArrayList<>();
    private adapterListener mListener;
    private int Harga_Pilih = 0;

    public Pelajaran1Adapter(Context mContext, ArrayList<pelajaran1> list_item, adapterListener mListener) {
        this.mContext = mContext;
        this.list_item = list_item;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //        menhubungkan aktifity main dng row_barang
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_pelajaran,parent,false);
        return new Pelajaran1Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        Memberikan nilai ke dlm komponen
        pelajaran1 i = list_item.get(position);
        holder.txt_judul.setText(String.valueOf(i.getJudul()));
        holder.txt_deskripsi.setText(String.valueOf(i.getDeskripsi()));
        holder.img_bhs.setImageResource(i.getGambar());
//        holder.txt_judul.setText(String.valueOf(i.getTokenytb()));
    }

    @Override
    public int getItemCount() {
        return list_item.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_judul,txt_deskripsi;
        ImageView img_bhs;
        ImageButton bt_beli;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            txt_judul = itemView.findViewById(R.id.txt_judul);
            txt_deskripsi = itemView.findViewById(R.id.txt_deskripsi);
            img_bhs = itemView.findViewById(R.id.img_bhs);
            bt_beli = itemView.findViewById(R.id.bt_beli);

            bt_beli.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V){
//                  mListener.munculkanToast();
                  int btn_urutan = 0;
                    btn_urutan = getAdapterPosition();
                    pelajaran1 i = list_item.get(btn_urutan);

                    mListener.tariksis(String.valueOf(i.getTokenytb()),String.valueOf(i.getDeskripsi()),String.valueOf(i.getJudul()));
                }
            });
        }
    }

    public interface adapterListener{
//                void munculkanToast();
        void tariksis(String txt_token,String txt_deskripsi,String txt_judul);

    }
}
