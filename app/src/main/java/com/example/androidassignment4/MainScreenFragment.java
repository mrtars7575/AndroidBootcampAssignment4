package com.example.androidassignment4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidassignment4.databinding.FragmentMainScreenBinding;


public class MainScreenFragment extends Fragment {
    private FragmentMainScreenBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainScreenBinding.inflate(inflater,container,false);

        binding.goToABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = MainScreenFragmentDirections.actionMainScreenFragmentToAFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });

        binding.goToXBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = MainScreenFragmentDirections.actionMainScreenFragmentToXFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });

        return binding.getRoot();
    }
}