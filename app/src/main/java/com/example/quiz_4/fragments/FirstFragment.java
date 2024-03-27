package com.example.quiz_4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz_4.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {

private FragmentFirstBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        //When a fragment is dynamically added to an activity (either programmatically or through XML),
        // it needs to specify where its layout will be placed within the activity's layout.
        // This is where the container comes into play.
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        // In the case of Android fragments, when the fragment's view is destroyed,
        // the binding object still holds a reference to the views in the layout.
        // If you don't set binding to null in onDestroyView(),
        // the binding object will continue to hold references to those views,
        // potentially preventing them from being garbage collected, which could lead to memory leaks.
    }
}