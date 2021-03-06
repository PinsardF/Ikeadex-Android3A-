package com.example.projetmobile.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.projetmobile.R;

public class SecondFragment extends Fragment {
    String descstr;
    boolean initialized = false;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(!initialized) {
            Bundle bundle = this.getArguments();
            descstr = bundle.getString("descbundle");
            initialized = true;
        }
        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        TextView desc = view.findViewById(R.id.desc_ikeamon);
        desc.setText(descstr);
    }
}
