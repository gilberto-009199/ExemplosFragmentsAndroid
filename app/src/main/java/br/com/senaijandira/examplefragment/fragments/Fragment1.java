package br.com.senaijandira.examplefragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.senaijandira.examplefragment.R;

public class Fragment1 extends Fragment {
    //No fragment vc deve usar o comando getContext para ver o contexto

    //exemplo:

    /*
    *   Tost.makeText(detContext,"oi" , Toast.LENTH_SHORT).SHOW();
    *
    * */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layuot1,container,false);

        return v;

    }
}
