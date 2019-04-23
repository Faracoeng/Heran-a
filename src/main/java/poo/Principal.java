package poo;

import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        Dimensao tamanho = new Dimensao(10,20,30);
//        Telefone intelbras = new Telefone(15,"456","789",50,tamanho);
//        System.out.println(intelbras.toString());
//        SemFio intel = new SemFio(12,"321","654",25,tamanho,500,45,4);
//        System.out.println(intel.toString());
//
//
//        intel.setNumSerie("75168468");
//        intel.imprimir();
//
        Telefone vetor[]= new Telefone[2];
        vetor[0] = new Telefone(15,"456","789",50,tamanho);
        vetor[1] = new SemFio(12,"321","654",25,tamanho,500,45,4);
        for(int i=0;i<2;i++){
            if(vetor[i] instanceof SemFio){
                SemFio c = (SemFio) vetor[i];
            }

        }
        Celular j5PRO = new Celular(78,"123456789","j5PRO",500,tamanho,2800,500,4,"Android");
        j5PRO.imprimir();
        j5PRO.setSo("IOS");
        vetor[1].setNumSerie("77777777777777");
        System.out.println(vetor[1].toString());
        System.out.println(j5PRO.toString());
    }
}
