package rm77136.drawerandfragments.nac.fiap.com.br.navigationdrawerfragments_nac;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import java.util.List;

public class CarroActivity extends AppCompatActivity {

    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FrameLayout fragmentContainer;
    List<Carro> carros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);

        carros = GeraCarro.listaCarros();

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.activity_carro);
        fragmentContainer = (FrameLayout)findViewById(R.id.fragment_container);

        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.abrir, R.string.fechar);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView = (NavigationView)findViewById(R.id.navigationview);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.mnHonda){

                    Carro carro = carros.get(item.getItemId());
                    Intent intent = new Intent(CarroActivity.this, hondafragment.class);
                    Bundle b = new Bundle();
                    intent.putExtra("carro", carro);
                    //b.putSerializable("carro", carro);
                    startActivity(intent);

//                   Fragment a = new ImpalaFragment();
//                   a.setArguments(b);
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new hondaragment()).addToBackStack(null).commit();
                    //startIntentSenderFromFragment(new ImpalaFragment(), R.id.fragment_container).addToBackStack(null).commit();



                }else if(item.getItemId() == R.id.mnBmw){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new bmwfragment()).addToBackStack(null).commit();
                }else if(item.getItemId() == R.id.mnNissan){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new nissanfragment()).addToBackStack(null).commit();
                }else if(item.getItemId() == R.id.mnFusca){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fuscafragment()).addToBackStack(null).commit();
                }else if(item.getItemId() == R.id.mnPassat){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new passatfragment()).addToBackStack(null).commit();
                }}
                drawerLayout = (DrawerLayout) findViewById(R.id.activity_carro);
                drawerLayout.closeDrawer(GravityCompat.START);
                return false;
            });
        });

    }




//    public void abrirFragment(Fragment fragment){
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit();
//    }
//
//   public void CarroCadilac(){
//       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CadilacFragment()).commit();
//  }
}
