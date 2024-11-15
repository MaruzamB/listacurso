package com.maruzamjunior.applistacurso.controller;

import com.maruzamjunior.applistacurso.model.Curso;

import java.util.ArrayList;
import java.util.List;



public class CursoController {

    private List listCursos;

    public List getListaCursos(){
        listCursos = new ArrayList <Curso>();
        listCursos.add(new Curso("JAVA"));
        listCursos.add(new Curso("PYTHON"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("C"));
        listCursos.add(new Curso("KOTLIN"));

        return listCursos;
    }
}
