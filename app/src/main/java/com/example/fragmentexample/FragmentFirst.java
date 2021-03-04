package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentFirst extends Fragment {
    private View view;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // constructing the view needed to inflate
        view = inflater.inflate(R.layout.fragment_first, container, false);

        // set the view
        button = view.findViewById(R.id.button_fragOne);
        button.setOnClickListener( v -> {
            Toast.makeText(getActivity(),"We are in Fragment 1", Toast.LENGTH_SHORT).show();
        });
        // return the view
        return view;
    }
}
