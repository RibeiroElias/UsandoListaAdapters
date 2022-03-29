package com.studies.wiseway.usandolistaadapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lvSelecoesCopa = findViewById(R.id.lvSelecoesCopa2);

        String itens[] = {"Alemanha", "Argentina", "Holanda", "Colombia", "Belgica"
                , "Uruguai", "Brasil"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, itens) ;

        lvSelecoesCopa.setAdapter(adapter);

        lvSelecoesCopa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tratarOpcoesItem(position);

            }
        });
    }

    private void tratarOpcoesItem(int position) {

        int posFifa = position + 1;
        Toast.makeText(this, "Posição no Ranking: " + posFifa, Toast.LENGTH_LONG).show();


    }
}