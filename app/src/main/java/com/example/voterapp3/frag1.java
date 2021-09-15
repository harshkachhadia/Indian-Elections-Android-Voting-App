package com.example.voterapp3;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class frag1 extends Fragment {
    private myinterface1 listener;
    Button b1;
    EditText e1;
    public interface myinterface1{
        void passstring(String x);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.FragmentClass,
                container, false);

        b1 = (Button) view.findViewById(R.id.submit);
        e1 = view.findViewById(R.id.search);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = e1.getText().toString();
                listener.passstring(x);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof myinterface)
            listener = (myinterface)context;
        else
            throw new RuntimeException(context.toString() + " must implement myinterface ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
