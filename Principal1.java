import java.util.Scanner;

public class Principal1{
  
  public static Scanner in = new Scanner(System.in);
  public static void main(String args[]){

     Carro1 car = new Carro1();
     car.tanque = 0;
     car.pessoas = 0;
     car.km= 0;
  
    
    while(true){
        System.out.println("digite o comando");
        String comando = in.nextLine();
        String[] c =  comando.split(" ");
        boolean res;
        
        if (c[0].equals("sair")){
            break;
        }else{
                switch(c[0]){
                case"ajuda":
                    System.out.println("\tabastecer\n"+"\tdesembarcar\n"+"\tembarcar x\n"+"\tandar x\n"+"\tshow");
                break;    
                    
                case"embarcar":
                   res = car.embarcar(); 
                   if(res == true){
                       System.out.println("embarque de pessoa feito!");                       
                   }else{  
                       System.out.println("Limite atingido!");
                   }
                break;
                
                case"desembarcar":
                    res = car.desembarcar();
                    if(res == true){
                        System.out.println("desembarque feito");
                    }else{
                        System.out.println("nao tem ninguem !");
                    }
                break;   
                
                case"abastecer":
                    float qtd = Float.parseFloat(c[1]);
                    car.abastecer(qtd);
                    System.out.println("tanque cheio");
                break;
                    
                case"andar":
                    float qtd1 = Float.parseFloat(c[1]);
                    res = car.andar(qtd1);
                   if(res == true){
                       System.out.println("viagem feita!");                       
                   }else if(car.pessoas==0){  
                       System.out.println("sem pessoas no carro");
                   }else{
                        System.out.println("gasolina insuficiente, abasteça seu carro");
                   }
                break;
                
                case"show":
                    System.out.println(car.Show());
                    break;                              
            }
        }
    }
  }
}

