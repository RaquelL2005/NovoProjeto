package br.com.etecia.novoprojeto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private Context mContexto;
    private List<Filmes> lstFilmes;

    public Adaptador(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    //criando o construtor da classe com parâmetros

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTitulo.setText(lstFilmes.get(position).getTitulo());
        holder.imagemFilmes.setImageResource(lstFilmes.get(position).getImagem());



    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }

    //criar a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitulo;
        ImageView imagemFilmes;
        CardView cardFilmes;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitulo = itemView.findViewById(R.id.idTituloFilmes);
            imagemFilmes = itemView.findViewById(R.id.idImgFilmes);
            cardFilmes = itemView.findViewById(R.id.idCardViewFilmes);

        }
    }


}
