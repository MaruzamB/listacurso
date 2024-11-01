package com.maruzamjunior.applistacurso.view;

import android.os.Bundle;

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

        int parada = 0;





    }
}