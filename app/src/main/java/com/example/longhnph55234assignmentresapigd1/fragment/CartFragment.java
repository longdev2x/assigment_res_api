package com.example.longhnph55234assignmentresapigd1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.longhnph55234assignmentresapigd1.Adapter.CartAdapter;
import com.example.longhnph55234assignmentresapigd1.DTO.ShoeDTO;
import com.example.longhnph55234assignmentresapigd1.R;

import java.util.ArrayList;

public class CartFragment extends Fragment implements CartAdapter.CartCallback{

    private RecyclerView rvCart;
    private CartAdapter adapter;
    private ArrayList<ShoeDTO> shoeList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        rvCart = view.findViewById(R.id.rvCart);
        shoeList = new ArrayList<>();

        shoeList.add(new ShoeDTO("Nike Air Max", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 1500000, R.drawable.img_shoe1, true, "Nike", 5));
        shoeList.add(new ShoeDTO("Adidas Ultraboost", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 2000000, R.drawable.img_shoe2, false, "Adidas", 20));
        shoeList.add(new ShoeDTO("Puma RS-X", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 1200000, R.drawable.img_shoe1, false, "Puma", 11));
        shoeList.add(new ShoeDTO("Vans Old Skool", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 800000, R.drawable.img_shoe2, true, "Van", 0));
        shoeList.add(new ShoeDTO("Nike Jordan", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 3000000, R.drawable.img_shoe2, true, "Nike", 2));
        shoeList.add(new ShoeDTO("Adidas NMD", "Đôi khi, bạn cần một đoạn văn bản soạn sẵn trong tài liệu Word máy tính với mục đích trình bày hoặc dàn trang. Vậy giải pháp để giải quyết vấn đề này là gì? Ngay sau đây, mình sẽ hướng dẫn những cách tạo đoạn văn bản ngẫu nhiên trong Word đến với mọi người nha.", 2500000, R.drawable.img_shoe1, false, "Adidas", 4));

        rvCart.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CartAdapter(shoeList, this);
        rvCart.setAdapter(adapter);

        return view;
    }

    @Override
    public void onEditClick(int position) {

    }

    @Override
    public void onDeleteClick(int position) {

    }
}