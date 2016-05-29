package com.example.cursodam.aqua_ckeck;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContadoresFragment extends Fragment {

    private EditText edidcontador,edsocio,edarqueta,edparaje;
    private TextView tvidcontador,tvsocio,tvarqueta,tvparaje;


    public ContadoresFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //recogemos la vista principal
        //referencia al contendedor
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.fragment_socios, container, false);

        //metodo set
        setHasOptionsMenu(true);

        //referencia a los objetos
        tvidcontador = (TextView) rootView.findViewById(R.id.tv_idsocio);
        tvsocio = (TextView) rootView.findViewById(R.id.tv_dnisocio);
        tvarqueta = (TextView) rootView.findViewById(R.id.tv_nombresocio);
        tvparaje = (TextView) rootView.findViewById(R.id.tv_apellidossocio);;

        edidcontador = (EditText) rootView.findViewById(R.id.ed_idsocio);
        edsocio = (EditText) rootView.findViewById(R.id.ed_dnisocio);
        edarqueta = (EditText) rootView.findViewById(R.id.ed_nombresocio);
        edparaje = (EditText) rootView.findViewById(R.id.ed_apellidossocio);
        return inflater.inflate(R.layout.fragment_contadores, container, false);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_socio, menu);

        super.onCreateOptionsMenu(menu, inflater);

    }

}
