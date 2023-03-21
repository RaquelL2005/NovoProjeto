package br.com.etecia.novoprojeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;
    RecyclerView idrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idrecycler = findViewById(R.id.IdListaFilmes);
        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                 new Filmes("Casamento Armado","Darcy (Jennifer Lopez) and Tom (Josh Duhamel) gather their families for the ultimate destination wedding but when the entire party is taken hostage",
                         "Comédia",
                         R.drawable.casamento)
        );
        listaFilmes.add(
                new Filmes("Gato de Botas 2","O Gato de Botas descobre que sua paixão pela aventura cobrou seu preço: ele já gastou oito de suas nove vidas. Ele então parte em uma jornada épica para encontrar o mítico Último Desejo e restaurar suas nove vidas.",
                        "Animação",
                        R.drawable.gato)
        );
        listaFilmes.add(
                new Filmes("Meu malvado favorito","Um homem que adora todas as coisas diabólicas, o supervilão Gru traça um plano para roubar a lua. Rodeado de um exército de pequenos ajudantes e seu arsenal de armas e máquinas de guerra, Gru se prepara para destruir quem atravessar seu caminho",
                        "Animação",
                        R.drawable.minions)
        );
        listaFilmes.add(
                new Filmes("Sherlock Holmes","Quando uma série de assassinatos brutais aterroriza Londres, não demora muito para o lendário detetive Sherlock Holmes e seu parceiro solucionador de crimes, o Dr. Watson, encontrar o assassino, Lord Blackwood. Um devoto das artes das trevas, Blackwood tem um esquema maior em mente e sua execução está em seus planos",
                        "Ação",
                        R.drawable.sherlock)
        );
        listaFilmes.add(
                new Filmes("Shrek 2","Shrek e Fiona acabaram de voltar da lua de mel e vivem felizes em sua casa no pântano. O casal recebe um convite dos pais da princesa, que querem conhecer o novo genro, para um jantar no castelo.",
                        "Animação",
                        R.drawable.shrek)
        );


        //instanciando a classe do adaptador e passando os parâmetros
        Adaptador adaptador = new Adaptador(getApplicationContext(), listaFilmes);

        idrecycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2) );
        idrecycler.setHasFixedSize(true);
        idrecycler.setAdapter(adaptador);

    }

}