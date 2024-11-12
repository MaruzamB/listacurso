package com.maruzamjunior.applistacurso.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.maruzamjunior.applistacurso.R;
import com.maruzamjunior.applistacurso.controller.PessoaController;
import com.maruzamjunior.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_listvip";

    PessoaController controller;

    Pessoa pessoa;
    Pessoa outraPessoa;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editCursoDesejado;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        SharedPreferences.Editor listaVip = preferences.edit();
        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Maruzam");
        pessoa.setSobreNome("Bueno");
        pessoa.setCursoDesejado("Java");
        pessoa.setTelefoneContato("9999999999");

        outraPessoa = new Pessoa();

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText(" ");
                editSobrenome.setText(" ");
                editCursoDesejado.setText(" ");
                editTelefoneContato.setText(" ");
            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Volte Sempre",
                        Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outraPessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                outraPessoa.setSobreNome(editSobrenome.getText().toString());
                outraPessoa.setCursoDesejado(editCursoDesejado.getText().toString());
                outraPessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo: " + outraPessoa.toString(), Toast.LENGTH_LONG).show();

                listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
                listaVip.putString("Sobrenome", pessoa.getSobreNome());
                listaVip.putString("CursoDesejado", pessoa.getCursoDesejado());
                listaVip.putString("TelefoneContato", pessoa.getTelefoneContato());

                listaVip.apply();

                controller.salvar(pessoa);
            }
        });

        Log.i("PooAndroid", pessoa.toString());
        Log.i("PooAndroid", outraPessoa.toString());


    }
}