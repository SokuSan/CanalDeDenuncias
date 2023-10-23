package com.example.canaldedenuncias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaSeleccionActivity extends AppCompatActivity {
    private Button btnAcosoSexual;
    private Button btnAcosoLaboral;
    private Button btnIncumplimientoEtico;
    private Button btnIncumplimientoDelito;
    public String temaPrincipal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_seleccion);

        btnAcosoSexual = findViewById(R.id.btnAcosoSexual);
        btnAcosoLaboral = findViewById(R.id.btnAcosoLaboral);
        btnIncumplimientoEtico = findViewById(R.id.btnIncumplimientoEtico);
        btnIncumplimientoDelito = findViewById(R.id.btnIncumplimientoNormativo);

        btnAcosoSexual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaPrincipal = "Acoso Sexual o por razón de sexo";
                irAPantalla2();
            }
        });

        btnAcosoLaboral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaPrincipal = "Acoso Laboral";
                irAPantalla2();
            }
        });

        btnIncumplimientoEtico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaPrincipal = "Incumplimiento del código ético";
                irAPantalla2();
            }
        });

        btnIncumplimientoDelito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaPrincipal = "Incumplimiento normativo o delito";
                irAPantalla2();
            }
        });


}
    public void irAPantalla2() {
        Intent intent = new Intent(this, PantallaFormularioActivity.class);
        intent.putExtra("temaPrincipal", temaPrincipal);
        startActivity(intent);
    }


}

