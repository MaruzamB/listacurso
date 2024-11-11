package com.maruzamjunior.applistacurso.controller;

import android.util.Log;

import com.maruzamjunior.applistacurso.model.Pessoa;

public class PessoaController {
    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

    }
}
