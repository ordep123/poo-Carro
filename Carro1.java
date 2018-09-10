public class Carro1{

public int pessoas = 0;
public double tanque = 0;
public double km = 0;

public boolean embarcar (){
    if(this.pessoas == 2){
        return false;
    }else{
        pessoas+=1;
        return true;
    }
}  
public boolean desembarcar(){
    if (this.pessoas == 0){
        return false;
    }else{
        pessoas -= 1;
        return true;
    }
}
public boolean andar(float qtd){
        if(pessoas == 0 || tanque < qtd/10.0){
            return false;
        }else{
            this.tanque -= qtd/10.0;
            this.km += qtd;
            return true;
        }
   }
public void abastecer(float qtd){
        this.tanque += qtd;
        if(this.tanque > 10){
            this.tanque = 10;
        }      

    }
public String Show(){
        return("pass:" +pessoas+ ", gasolina:" +tanque+ ", Km:" +km);
   }

}
