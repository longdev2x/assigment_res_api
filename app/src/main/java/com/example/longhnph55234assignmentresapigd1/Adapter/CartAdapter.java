package com.example.longhnph55234assignmentresapigd1.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.longhnph55234assignmentresapigd1.DTO.ShoeDTO;
import com.example.longhnph55234assignmentresapigd1.R;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    private ArrayList<ShoeDTO> shoeList;
    private CartCallback callback;

    public CartAdapter(ArrayList<ShoeDTO> shoeList, CartCallback callback) {
        this.shoeList = shoeList;
        this.callback = callback;
    }

    public interface CartCallback {
        void onEditClick(int position);
        void onDeleteClick(int position);
    }

    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        ShoeDTO shoe = shoeList.get(position);

        holder.imgShoe.setImageResource(shoe.getUrl());
        holder.tvShoeName.setText(shoe.getName());
        holder.tvPrice.setText("Price: " + shoe.getPrice() + "$");
        holder.tvQuantity.setText("Số Lượng: " + shoe.getQuantity() + "c");

        holder.btnEdit.setOnClickListener(v -> {
            if (callback != null) callback.onEditClick(position);
        });

        holder.btnDelete.setOnClickListener(v -> {
            if (callback != null) callback.onDeleteClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return shoeList != null ? shoeList.size() : 0;
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        ImageView imgShoe;
        TextView tvShoeName, tvPrice, tvQuantity;
        ImageButton btnEdit, btnDelete;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            imgShoe = itemView.findViewById(R.id.imgShoe);
            tvShoeName = itemView.findViewById(R.id.tvShoeName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvQuantity = itemView.findViewById(R.id.tvQuantity);
            btnEdit = itemView.findViewById(R.id.btnEdit);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}
