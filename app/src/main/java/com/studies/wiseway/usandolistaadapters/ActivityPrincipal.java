package com.studies.wiseway.usandolistaadapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lvEstudoListView = findViewById(R.id.lvEstudoListView);

        lvEstudoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                tratarOpcoesItem(position);
                
            }
        });
    }

    private void tratarOpcoesItem(int position) {

        switch (position) {

            case 0:
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                //startActivity(new Intent(getContext(), LoginActivity.class));
                break;

            case 1:
                Intent intent1 = new Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent1);
                break;

            case 2:
                startActivity(new Intent(getBaseContext(),MainActivity3.class));
                break;

            case 3:
                startActivity(new Intent(getBaseContext(), MainActivity4.class));
                break;


        }

    }
}