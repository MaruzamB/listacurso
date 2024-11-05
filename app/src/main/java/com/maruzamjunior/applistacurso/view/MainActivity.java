package com.maruzamjunior.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.maruzamjunior.applistacurso.R;
import com.maruzamjunior.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;//criação do obejetp pessoa
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    //criar os objetos edittext e buttons
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

        pessoa = new Pessoa();//criação da instancia
        //chamada do metodo set
        pessoa.setPrimeiroNome("Maruzam");
        pessoa.setSobreNome("Bueno");
        pessoa.setCursoDesejado("Java");
        pessoa.setTelefoneContato("9999999999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Bueno");
        outraPessoa.setSobreNome("Maruzam");
        outraPessoa.setCursoDesejado("Python");
        outraPessoa.setTelefoneContato("88888888");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        //pegar os dados pessoa
        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

       /*
        //pegar os dados outraPessoa
        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobrenome.setText(outraPessoa.getSobreNome());
        editCursoDesejado.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());
        */

/*

        dadosPessoa = " Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = " Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();
*/

        Log.i("PooAndroid",pessoa.toString());
        Log.i("PooAndroid", outraPessoa.toString());














    }
}