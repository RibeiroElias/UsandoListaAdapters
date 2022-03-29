package com.studies.wiseway.usandolistaadapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView lvSelecoesCopa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSelecoesCopa = findViewById(R.id.lvSelecoesCopa);

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