package br.com.etecia.novoprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                 new Filmes("Casamento Armado","Darcy (Jennifer Lopez) and Tom (Josh Duhamel) gather their families for the ultimate destination wedding but when the entire party is taken hostage",
                         "Comédia",
                         R.drawable.casamento)
        );


        //instanciando a classe do adaptador e passando os parâmetros
        Adaptador adaptador = new Adaptador(getApplicationContext(), listaFilmes);
    }

}