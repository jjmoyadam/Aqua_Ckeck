package com.example.cursodam.aqua_ckeck;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SociosFragment extends Fragment {

    private EditText edidsocio, eddni, ednombre, edapellidos, eddireccion, edtelefono;
    private TextView tvidsocio, tvdni, tvnombre, tvapellidos, tvdireccion, tvtelefono;
    private ListView listView;
    private DrawerLayout drawerLayout;


    public SociosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //recogemos la vista principal
        //referencia al contendedor
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.fragment_socios, container, false);


        //metodo set
        setHasOptionsMenu(true);

        //referencia a los objetos
        tvidsocio = (TextView) rootView.findViewById(R.id.tv_idsocio);
        tvdni = (TextView) rootView.findViewById(R.id.tv_dnisocio);
        tvnombre = (TextView) rootView.findViewById(R.id.tv_nombresocio);
        tvapellidos = (TextView) rootView.findViewById(R.id.tv_apellidossocio);
        tvdireccion = (TextView) rootView.findViewById(R.id.tv_direccionsocio);
        tvtelefono = (TextView) rootView.findViewById(R.id.tv_telefonosocio);

        edidsocio = (EditText) rootView.findViewById(R.id.ed_idsocio);
        eddni = (EditText) rootView.findViewById(R.id.ed_dnisocio);
        ednombre = (EditText) rootView.findViewById(R.id.ed_nombresocio);
        edapellidos = (EditText) rootView.findViewById(R.id.ed_apellidossocio);
        eddireccion = (EditText) rootView.findViewById(R.id.ed_direccionsocio);
        edtelefono = (EditText) rootView.findViewById(R.id.ed_telefonosocio);



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_socios, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.menu_socio, menu);

        super.onCreateOptionsMenu(menu, inflater);
    }
}
