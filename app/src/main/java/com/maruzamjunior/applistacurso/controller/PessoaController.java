package com.maruzamjunior.applistacurso.controller;

import android.util.Log;

import com.maruzamjunior.applistacurso.model.Pessoa;

public class PessoaController {

    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada: " );
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

    }
}
