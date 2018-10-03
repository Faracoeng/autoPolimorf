package poo;

import veiculos.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Alguns testes para entender...\n");

        VeiculoTerrestre a = new Ferrari("Testarossa");
        VeiculoTerrestre b = new Panther("Panther2");
        VeiculoTerrestre c = new Pampa("Pampa Guia");
        VeiculoMarinho   d = new Panther("Panther python");
        VeiculoAnfibio e = new Panther("Panther watercar");
        Veiculo f = new Ferrari("F430");
        Veiculo g = new Panther("Panther Fusc");
        Veiculo h = new Pampa("LS");


        a.acelerar(10);
        b.acelerar(10);
        c.acelerar(10);
        e.acelerar(10);

        ((Ferrari) a).abrirCapota();

        d.esvaziarLastro();
        e.esvaziarLastro();

        ((Ferrari) f).acelerar(1);

        Ferrari i = (Ferrari) f;
        i.abrirCapota();
        i.acelerar(10);

        ((Ferrari) f).ligarFarolNeblina();


    }

}
//    Só é possível abrir a caçamba se o carro estiver parado
//        Só é possível ativar ou desativar a tração integral se o veículo estiver
//        parado
//        Só é possível ativar a tração integral se o veículo anfíbio estiver com
//        as rodas abertas
//        Só é possível abrir ou fechar a capota se o carro estiver parado, com
//        exceção da Ferrari, pois essa permite fazer isso se a velocidade
//        estiver abaixo dos 20km/h
//        Ao recolher as rodas é necessário esvaziar o lastro
//        Se necessário, modifique a hierarquia de classes para melhorar o
//        projeto
