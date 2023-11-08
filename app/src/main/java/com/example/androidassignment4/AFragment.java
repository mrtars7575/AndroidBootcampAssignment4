package com.example.androidassignment4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidassignment4.databinding.FragmentABinding;


public class AFragment extends Fragment {


    private FragmentABinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater,container,false);

        binding.goToBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections directions = AFragmentDirections.actionAFragmentToBFragment();
                Navigation.findNavController(view).navigate(directions);
            }
        });

        return binding.getRoot();
    }
}