package com.studies.wiseway.usandolistaadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //se não quiser utilizar o xml, apagar linha acima. Ver texto odt

        String itens[] = {"Alemanha", "Argentina", "Holanda", "Colombia", "Belgica", "Uruguai"
                , "Brasil"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this
                , android.R.layout.simple_list_item_1, itens);

        this.setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {

        int posFifa = position + 1;

        Toast.makeText(this, "Posição no Ranking: " + posFifa, Toast.LENGTH_LONG).show();
    }



}