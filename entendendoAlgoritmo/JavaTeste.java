package com.exemplo.aprendendokotlinzero.entendendoAlgoritmo;

public class JavaTeste {
    public void salvarTelefone(String... telefones) {
       for (String telefone : telefones) {
           System.out.println("Telefone: " + telefone);
       }
    }
}
