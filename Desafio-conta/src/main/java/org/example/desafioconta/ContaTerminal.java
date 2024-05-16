package org.example.desafioconta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        AtributosConta atributos = new AtributosConta();

        System.out.println("SEJA BEM-VINDO(A), POR FAVOR DIGITE SEU NOME:");
        atributos.setNome(leitura.nextLine());

        System.out.println("Digite o número da sua agência:");
        atributos.setAgencia(leitura.nextLine());

        System.out.println("Digite o número da sua conta: ");
        atributos.setNumero(leitura.nextInt());

        System.out.println("Digite o seu saldo:");
        atributos.setSaldo(leitura.nextDouble());

        System.out.println("Olá " +
                atributos.getNome() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                atributos.getAgencia() +
                ", conta " +
                atributos.getNumero() +
                " e seu saldo " +
                atributos.getSaldo()+
                " já está disponível para saque!");



    }
}