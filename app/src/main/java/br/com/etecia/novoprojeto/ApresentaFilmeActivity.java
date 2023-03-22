package br.com.etecia.novoprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ApresentaFilmeActivity extends AppCompatActivity {

    TextView mTitulo, mCategoria, mDescricao;
    ImageView mImagem;

    Button btnvoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);


        mTitulo = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mCategoriaFilme);
        mDescricao = findViewById(R.id.mDescFilme);
        mImagem = findViewById(R.id.mImagemFilme);
        btnvoltar = findViewById(R.id.BtnVoltar);
        Intent intent = getIntent();

        String titulo, descricao, categoria;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");
        imagemFilme = intent.getExtras().getInt("ImagemFilme");

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mTitulo.setText(titulo);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);

        mImagem.setImageResource(imagemFilme);



    }
}