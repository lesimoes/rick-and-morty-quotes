package com.example.lesimoes.rickandmortyquotes;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        this.mViewHolder.mQuotes = findViewById(R.id.list_quotes);


        ArrayAdapter<Quote> adapter = new ArrayAdapter<Quote>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                this.mViewHolder.list
        );

        this.mViewHolder.mQuotes.setAdapter(adapter);

        addQuotes();
        addQuotes();

        this.mViewHolder.mQuotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), mViewHolder.list.get(i).getAuthor(), Toast.LENGTH_SHORT).show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Huhhhgh", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private void addQuotes() {
        this.mViewHolder.list.add(new Quote("Wubba Lubba Dub Dub", "Rick"));
        this.mViewHolder.list.add(new Quote("Existem prós e contras em (arrota) todas as linhas temporais alternativas. Um fato curioso sobre esta: ela tem gigantescas aranhas telepáticas, onze 'onze de setembro', e o melhor sorvete do multiverso!\"", "Rick"));
        this.mViewHolder.list.add(new Quote("Bem, cientificamente, tradições são idiotas.", "Rick"));
        this.mViewHolder.list.add(new Quote("Casamentos são basicamente funerais com bolo", "Rick"));
        this.mViewHolder.list.add(new Quote("Morty: E quanto a realidade que deixamos para trás?\n" +
                "Rick: E quanto a realidade em que Hitler curou o câncer, Morty? A resposta é: não pense sobre isso.", "Rick"));
        this.mViewHolder.list.add(new Quote("Eu me transformei em um picles, Morty! Eu sou Picles Riiiick!", "Rick"));
        this.mViewHolder.list.add(new Quote("Ninguém existe por um propósito. Ninguém pertence a lugar nenhum. Todo mundo vai morrer. Vem ver TV.", "Morty"));
        this.mViewHolder.list.add(new Quote("Sr. Presidente, se eu aprendi alguma coisa hoje, é que as vezes você tem que ligar o f*da-se!", "Morty"));
        this.mViewHolder.list.add(new Quote("Você já tentou relaxar? É um paradoxo!", "Jerry"));
    }


    private static class ViewHolder {

        ListView mQuotes;
        ArrayList<Quote> list = new ArrayList<Quote>();
    }


}



