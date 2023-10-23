package com.example.canaldedenuncias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class PantallaFormularioActivity extends Activity {
    private TextView tvSeleccion;
    String temaPrincipal;
    private EditText edNombre;
    private EditText etApellidos;
    private EditText etEmail;
    private EditText etTelefono;
    private Switch switchIdentidad;
    private RadioButton rbEmpleado;
    private RadioGroup radioGroup;
    private TextView tvRelacionConOrg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_formulario);
        tvSeleccion = findViewById(R.id.tvSeleccionPrincipal);
        edNombre = findViewById(R.id.edNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);
        radioGroup = findViewById(R.id.radioGroup);
        rbEmpleado = findViewById(R.id.rbEmpleado);
        radioGroup.check(rbEmpleado.getId());
        tvRelacionConOrg = findViewById(R.id.tvRelacionConOrg);

        Intent intent = getIntent();
        temaPrincipal = intent.getStringExtra("temaPrincipal");
        tvSeleccion.setText(String.valueOf(temaPrincipal));

        switchIdentidad = findViewById(R.id.switchIdentidad);

        switchIdentidad = findViewById(R.id.switchIdentidad);

        switchIdentidad.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                edNombre.setVisibility(View.GONE);
                etApellidos.setVisibility(View.GONE);
                etEmail.setVisibility(View.GONE);
                etTelefono.setVisibility(View.GONE);
                radioGroup.setVisibility(View.GONE);
                tvRelacionConOrg.setVisibility(View.GONE);
            } else {
                edNombre.setVisibility(View.VISIBLE);
                etApellidos.setVisibility(View.VISIBLE);
                etEmail.setVisibility(View.VISIBLE);
                etTelefono.setVisibility(View.VISIBLE);
                radioGroup.setVisibility(View.VISIBLE);
                tvRelacionConOrg.setVisibility(View.VISIBLE);
            }
        });



}}
