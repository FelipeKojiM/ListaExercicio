
package com.mycompany.exercicio3;

public class ContaCorrente extends ContaBancaria{
    public void CalculaValorChequeEspecial(){
        ContaBancaria conta1 = new ContaBancaria();
            conta1.setSaldo(12);  
            System.out.println(getSaldo());
    }
}
