package com.example.atividade03;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Religion_Activity extends AppCompatActivity {

    private TextView txtTitulo, txtDescricao, txtAdeptos;
    private ImageView imagemReligiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.religion_layout);

        txtAdeptos = findViewById(R.id.txtIdAdeptos);
        txtTitulo = findViewById(R.id.txtIdTitulo);
        txtDescricao = findViewById(R.id.txtIdDescricao);
        imagemReligiao = findViewById(R.id.idImgReligionN);

        Intent intent = getIntent();

        String adeptos = intent.getExtras().getString("Adeptos");
        String titulo = intent.getExtras().getString("Titulo");
        String descricao = intent.getExtras().getString("Descricao");
        int miniatura = intent.getExtras().getInt("Miniatura");

        txtAdeptos.setText(adeptos);
        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        imagemReligiao.setImageResource(miniatura);
    }
}