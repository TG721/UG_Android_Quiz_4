package com.example.quiz_4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz_4.databinding.FragmentFirstBinding;
import com.example.quiz_4.databinding.FragmentFourthBinding;


public class FourthFragment extends Fragment {

    FragmentFourthBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return FragmentFourthBinding.inflate(inflater,container, false).getRoot();
    }
}