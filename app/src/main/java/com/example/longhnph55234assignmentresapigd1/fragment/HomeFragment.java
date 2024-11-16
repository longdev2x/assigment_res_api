package com.example.longhnph55234assignmentresapigd1.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.longhnph55234assignmentresapigd1.Adapter.ShoeAdapter;
import com.example.longhnph55234assignmentresapigd1.DTO.ShoeDTO;
import com.example.longhnph55234assignmentresapigd1.R;
import com.example.longhnph55234assignmentresapigd1.screens.Detail;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements ShoeAdapter.OnShoeClickListener{

    private RecyclerView recyclerView;
    private ShoeAdapter shoeAdapter;
    ArrayList<ShoeDTO> shoeList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        shoeList = new ArrayList<>();

        shoeList.add(new ShoeDTO("Nike Air Max", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 1500000, R.drawable.img_shoe1, true, "Nike", 0));
        shoeList.add(new ShoeDTO("Adidas Ultraboost", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 2000000, R.drawable.img_shoe2, false, "Adidas", 0));
        shoeList.add(new ShoeDTO("Puma RS-X", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 1200000, R.drawable.img_shoe1, false, "Puma", 0));
        shoeList.add(new ShoeDTO("Vans Old Skool", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 800000, R.drawable.img_shoe2, true, "Van", 0));
        shoeList.add(new ShoeDTO("Nike Jordan", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 3000000, R.drawable.img_shoe2, true, "Nike", 0));
        shoeList.add(new ShoeDTO("Adidas NMD", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 2500000, R.drawable.img_shoe1, false, "Adidas", 0));


        shoeAdapter = new ShoeAdapter(shoeList, this);

        recyclerView.setAdapter(shoeAdapter);

        return view;
    }

    @Override
    public void onShoeClick(int position) {
        ShoeDTO shoe = shoeList.get(position);
        Intent intent = new Intent(getActivity(), Detail.class);
        intent.putExtra("name", shoe.getName());
        intent.putExtra("description", shoe.getDescription());
        intent.putExtra("price", shoe.getPrice());
        intent.putExtra("image", shoe.getUrl());
        intent.putExtra("isFavorite", shoe.isFavorite());
        intent.putExtra("category", shoe.getCategory());
        startActivity(intent);
    }
}
