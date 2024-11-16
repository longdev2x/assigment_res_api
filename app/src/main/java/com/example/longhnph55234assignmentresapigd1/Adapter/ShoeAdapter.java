package com.example.longhnph55234assignmentresapigd1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.longhnph55234assignmentresapigd1.DTO.ShoeDTO;
import com.example.longhnph55234assignmentresapigd1.R;

import java.util.List;

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder> {
    private final List<ShoeDTO> shoeList;
    private final OnShoeClickListener listener;

    public ShoeAdapter(List<ShoeDTO> shoeList, OnShoeClickListener listener) {
        this.shoeList = shoeList;
        this.listener = listener;
    }

    public interface OnShoeClickListener {
        void onShoeClick(int position);
    }

    @NonNull
    @Override
    public ShoeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shoe_item, parent, false);
        return new ShoeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoeViewHolder holder, int position) {
        ShoeDTO shoe = shoeList.get(position);

        //gán dl
        holder.bind(shoe);

        holder.itemView.setOnClickListener(v -> listener.onShoeClick(position));
    }

    @Override
    public int getItemCount() {
        return shoeList.size();
    }

    //Áh xạ
    static class ShoeViewHolder extends RecyclerView.ViewHolder {
        private final ImageView shoeImage;
        private final TextView shoeName;
        private final TextView shoePrice;

        public ShoeViewHolder(@NonNull View itemView) {
            super(itemView);
            shoeImage = itemView.findViewById(R.id.shoe_image);
            shoeName = itemView.findViewById(R.id.shoe_name);
            shoePrice = itemView.findViewById(R.id.shoe_price);
        }

        void bind(ShoeDTO shoe) {
            shoeImage.setImageResource(shoe.getUrl());
            shoeName.setText(shoe.getName());
            shoePrice.setText(String.format("%,d VND", shoe.getPrice()));
        }
    }
}
