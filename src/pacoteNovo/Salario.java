package pacoteNovo;
import java.util.Scanner;

public class Salario {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = null;
        double salario, novoSalario, soma, diferenca;

        while(nome != "fim") {
        System.out.print("digite seu nome");
        nome = scan.nextLine();


        System.out.print("digite o seu salário atual");
        salario = scan.nextInt();




        if(salario <150){
        	novoSalario = salario + (salario*25)/100;
        	soma = salario + novoSalario;
        	diferenca = novoSalario - salario;
        	System.out.print("Nome: "+nome+"\nSalário atual: "+novoSalario+"\nSoma dos dois salários: "+soma+"\na diferenca entre os dois são:"+diferenca);
        	
        }
        if(salario >150 && salario <300) { 
        	novoSalario = salario + (salario*20)/100;
        	soma = salario + novoSalario;
        	diferenca = novoSalario - salario;
        	System.out.print("Nome: "+nome+"\nSalário atual: "+novoSalario+"\nSoma dos dois salários: "+soma+"\n a diferenca entre os dois são:"+diferenca);
        	
        }
        if(salario >300 && salario >600) { 
        	novoSalario = salario + (salario*15)/100;
        	soma = salario + novoSalario;
        	diferenca = novoSalario - salario;
        	System.out.print("Nome: "+nome+"\nSalário atual: "+novoSalario+"\nSoma dos dois salários: "+soma+"\n a diferenca entre os dois são:"+diferenca);
        	
        }
        if(salario >600) { 
        	novoSalario = salario + (salario*10)/100;
        	soma = salario + novoSalario;
        	diferenca = novoSalario - salario;
        	System.out.print("Nome: "+nome+"\nSalário atual: "+novoSalario+"\nSoma dos dois salários: "+soma+"\n a diferenca entre os dois são:"+diferenca);
        	
        }





    }
}
}


