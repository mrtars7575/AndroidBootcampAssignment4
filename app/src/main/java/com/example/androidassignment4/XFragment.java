package com.example.androidassignment4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidassignment4.databinding.FragmentXBinding;


public class XFragment extends Fragment {

    private FragmentXBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentXBinding.inflate(inflater,container,false);
        binding.goToYBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections directions = XFragmentDirections.actionXFragmentToYFragment();
                Navigation.findNavController(view).navigate(directions);
            }
        });
        return binding.getRoot();
    }
}