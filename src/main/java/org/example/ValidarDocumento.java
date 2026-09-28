package org.example;

public class ValidarDocumento {
    public boolean validarDocumento(String cpf){
        cpf = cpf.replace(".", "").replace("-", "");

        if(cpf.length() != 11){
            return false;
        }

        int soma = 0;

        for(int i = 0; i < 11; i++){
            char caractere = cpf.charAt(i);
            if(!Character.isDigit(caractere)){
                return false;
            }
        }

        char primeiro = cpf.charAt(0);
        boolean todosIguais = true;
        for(int i = 1; i < 11; i++){
            if(cpf.charAt(i)!= primeiro){
                todosIguais = false;
            }
        }
        if(todosIguais){
            return false;
        }

        for(int i = 0; i < 9; i++){
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = soma % 11;
        int primeiroDigito = 11 - resto;

        if(primeiroDigito >= 10){
            primeiroDigito = 0;
        }
        int digitoCpf = Character.getNumericValue(cpf.charAt(9));

        if (primeiroDigito != digitoCpf){
            return false;
        }
        soma = 0;
        for(int i = 0; i < 10; i++){
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }

        resto = soma % 11;
        int segundoDigito = 11 - resto;
        if(segundoDigito >= 10){
            segundoDigito = 0;
        }

        int digitoCpf2 = Character.getNumericValue(cpf.charAt(10));

        if (segundoDigito != digitoCpf2){
            return false;
        }

        return true;
    }
}
