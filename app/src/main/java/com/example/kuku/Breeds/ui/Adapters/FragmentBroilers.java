package com.example.kuku.Breeds.ui.Adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.kuku.R;

public class FragmentBroilers extends Fragment {


    public FragmentBroilers () {

    }
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_broiler, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        return root;
    }
}