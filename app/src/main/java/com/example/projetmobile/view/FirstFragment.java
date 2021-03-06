package com.example.projetmobile.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.projetmobile.R;

import org.jetbrains.annotations.Nullable;

public class FirstFragment extends Fragment {
    String typestr = null;
    String naturestr;
    String envstr;
    boolean initialized = false;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(!initialized) {
            Bundle bundle = this.getArguments();
            String[] infos = bundle.getStringArray("infos");
            typestr = infos[0];
            naturestr = infos[1];
            envstr = infos[2];
            initialized = true;
        }
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        TextView type = view.findViewById(R.id.type_ikeamon);
        TextView nature = view.findViewById(R.id.nature_ikeamon);
        TextView env = view.findViewById(R.id.env_ikeamon);
        type.setText("Type : "+typestr);
        nature.setText("Nature : "+naturestr);
        env.setText("Trouvé dans la zone "+envstr);
    }
}
