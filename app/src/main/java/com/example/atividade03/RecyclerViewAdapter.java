package com.example.atividade03;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import org.w3c.dom.Text;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Religions> mData;

    public RecyclerViewAdapter(Context mContext, List<Religions> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_religions, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tvTituloReligion.setText(mData.get(position).getTitulo());
        holder.imgLivro.setImageResource(mData.get(position).getMiniatura());
        holder.tvDescricao.setText(mData.get(position).getDescricao());
        holder.tvAdeptos.setText(mData.get(position).getAdeptos());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, Religion_Activity.class);

                intent.putExtra("Titulo",mData.get(position).getTitulo());
                intent.putExtra("Descricao",mData.get(position).getDescricao());
                intent.putExtra("Adeptos",mData.get(position).getAdeptos());
                intent.putExtra("Miniatura",mData.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvAdeptos;
        TextView tvTituloReligion;
        TextView tvDescricao;
        ImageView imgLivro;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            tvAdeptos = itemView.findViewById(R.id.id_lblAdeptos);
            tvTituloReligion = itemView.findViewById(R.id.id_lblTituloReligion);
            tvDescricao = itemView.findViewById(R.id.id_lblDescricao);
            imgLivro =  itemView.findViewById(R.id.id_imgLivro);
            cardView = itemView.findViewById(R.id.idCardView);
        }
    }
}
