package com.example.cursodam.aqua_ckeck;

import android.support.v4.app.FragmentManager;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //creacion de las variables
    private ImageButton ibSocios, ibContadores, ibLecturas, ibOpciones;
    private ListView listView;
    private DrawerLayout drawerLayout;

    //creacion del arraylist para los item del menu
    ArrayList<DrawerItem> items = new ArrayList<DrawerItem>();

    //tipo numerado para la carga de menus
    private enum Modo {
        Socios,
        Contadores,
        Lecturas,
        Opciones,
        Portada,
    }

    private Modo modo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia a los objetos
        ibSocios = (ImageButton) findViewById(R.id.ib_Socios);
        ibContadores = (ImageButton) findViewById(R.id.ib_contadores);
        ibLecturas = (ImageButton) findViewById(R.id.ib_lecturas);
        ibOpciones = (ImageButton) findViewById(R.id.ib_opciones);
        //referencias a listview
        listView = (ListView) findViewById(R.id.list_view);

        //referencias al DrawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        //mostramos el menu lateral de la app por si hay algún estilo que lo deshabilitó
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //getSupportActionBar().setHomeButtonEnabled(fa);

        //adaptador del menu lateral
        final String[] opciones = {"Alta Socio", "Baja  Socio", "Consulta Socio",};

        listView.setAdapter(new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                opciones));

        //metodos on click
        ibSocios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cargarSocios();
            }
        });

        ibContadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cargarContadores();

            }
        });

        ibLecturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarLecturas();

            }
        });

        ibOpciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarOpciones();

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:

                if (drawerLayout.isDrawerOpen(listView)) {
                    drawerLayout.closeDrawers();
                } else {
                    drawerLayout.openDrawer(listView);
                }
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_portada, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void cargarSocios() {

        SociosFragment fragmentsocios = new SociosFragment();

        //pasamos los argumentos al fragment el nombre del archivo y si es nueva o no
        //Bundle args = new Bundle();
        //args.putString(PortadaFragment.ARG_NOMBRE_AUDITORIA, nombreArchivo);
        //args.putBoolean(PortadaFragment.ARG_NUEVA_AUDITORIA, nuevo);
        //lo asignamos con el set
        //fragmentportada.setArguments(args);
        //mediante el fragmentManager reemplazamos el content_frame por el fragment creado con los datos
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.LinearMain, fragmentsocios).commit();

        //boton del menu
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //carga del menu lateral
        cargaMenuLateral();

        //y cerramos drawerList
        drawerLayout.closeDrawer(listView);


    }

    public void cargarContadores() {

        ContadoresFragment fragmentcontadores = new ContadoresFragment();

        //pasamos los argumentos al fragment el nombre del archivo y si es nueva o no
        //Bundle args = new Bundle();
        //args.putString(PortadaFragment.ARG_NOMBRE_AUDITORIA, nombreArchivo);
        //args.putBoolean(PortadaFragment.ARG_NUEVA_AUDITORIA, nuevo);
        //lo asignamos con el set
        //fragmentportada.setArguments(args);
        //mediante el fragmentManager reemplazamos el content_frame por el fragment creado con los datos
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.LinearMain, fragmentcontadores).commit();

        //boton del menu
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //carga del menu lateral
        cargaMenuLateral();

        //y cerramos drawerList
        drawerLayout.closeDrawer(listView);


    }

    public void cargarLecturas() {

        LecturasFragment fragmentlecturas = new LecturasFragment();

        //pasamos los argumentos al fragment el nombre del archivo y si es nueva o no
        //Bundle args = new Bundle();
        //args.putString(PortadaFragment.ARG_NOMBRE_AUDITORIA, nombreArchivo);
        //args.putBoolean(PortadaFragment.ARG_NUEVA_AUDITORIA, nuevo);
        //lo asignamos con el set
        //fragmentportada.setArguments(args);
        //mediante el fragmentManager reemplazamos el content_frame por el fragment creado con los datos
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.LinearMain, fragmentlecturas).commit();

        //boton del menu
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //carga del menu lateral
        cargaMenuLateral();

        //y cerramos drawerList
        drawerLayout.closeDrawer(listView);

    }

    public void cargarOpciones() {

        LecturasFragment fragmentlecturas = new LecturasFragment();

        //pasamos los argumentos al fragment el nombre del archivo y si es nueva o no
        //Bundle args = new Bundle();
        //args.putString(PortadaFragment.ARG_NOMBRE_AUDITORIA, nombreArchivo);
        //args.putBoolean(PortadaFragment.ARG_NUEVA_AUDITORIA, nuevo);
        //lo asignamos con el set
        //fragmentportada.setArguments(args);
        //mediante el fragmentManager reemplazamos el content_frame por el fragment creado con los datos
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.LinearMain, fragmentlecturas).commit();

        //giro del fragment para su visionado


        //y cerramos drawerList
        drawerLayout.closeDrawer(listView);

    }
    public void cargaMenuLateral() {
        //carga de los iconos
        items = itemsmenulateral();
        // Relacionar el adaptador y la escucha de la lista del drawer
        listView.setAdapter(new DrawerListAdapter(this, items));
        listView.setOnItemClickListener(new DrawerItemClickListener());

    }
    private ArrayList<DrawerItem> itemsmenulateral() {

        ArrayList<DrawerItem> items = new ArrayList<DrawerItem>();
        items.add(new DrawerItem(getResources().getString(R.string.itemSocio), R.drawable.ic_socios));
        items.add(new DrawerItem(getResources().getString(R.string.itemContador), R.drawable.ic_contadores));
        items.add(new DrawerItem(getResources().getString(R.string.itemLecturas), R.drawable.ic_lecturas));
        items.add(new DrawerItem(getResources().getString(R.string.itemOpciones), R.drawable.ic_opciones));
        items.add(new DrawerItem(getResources().getString(R.string.itemPortada), R.drawable.ic_portada));
        return items;
    }
    /* La escucha del ListView en el Drawer del menu de la aplicacion para  */
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //selectItem(position);
            switch (position) {
                case 0:
                    Toast.makeText(getApplicationContext(),"Socios",Toast.LENGTH_SHORT).show();
                    cargarSocios();
                    break;
                case 1:
                    Toast.makeText(getApplicationContext(),"Contadores",Toast.LENGTH_SHORT).show();
                    cargarContadores();
                    break;
                case 2:
                    Toast.makeText(getApplicationContext(),"Lecturas",Toast.LENGTH_SHORT).show();
                    cargarLecturas();
                    break;
                case 3:
                    Toast.makeText(getApplicationContext(),"Opciones",Toast.LENGTH_SHORT).show();
                    cargarOpciones();
                    break;
                case 4:
                    getFragmentManager().popBackStack();
                    Toast.makeText(getApplicationContext(),"Portada",Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }

        }

    }
}
