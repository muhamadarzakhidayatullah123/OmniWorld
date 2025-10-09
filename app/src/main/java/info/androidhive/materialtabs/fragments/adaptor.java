package info.androidhive.materialtabs.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import info.androidhive.materialtabs.R;

public class adaptor extends RecyclerView.Adapter<adaptor.MahasiswaViewHolder> {private ArrayList<modelbangunruang> dataList;

    public adaptor(ArrayList<modelbangunruang> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.bangun.setText(dataList.get(position).getBangun());
        holder.rumus.setText(dataList.get(position).getRumus());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView bangun, rumus;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            bangun = (TextView) itemView.findViewById(R.id.txt_bangun);
            rumus = (TextView) itemView.findViewById(R.id.txt_rumus);
        }
    }
}