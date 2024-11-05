import java.sql.SQLOutput;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void Riscar(){
        if (tampada == true){
            System.out.println("A caneta está tampada, destampe para escrever");
        }else{
            System.out.println("A caneta não está tampada, pode escrever");
        }
    }

    public void Tampar(){
        tampada = true;
    }

    public void Destampar(){
        tampada = false;
    }

    public void Estado(){
        System.out.println("Esta caneta é do modelo: " + modelo);
        System.out.println("Esta caneta tem a cor: " + cor);
        System.out.println("Esta caneta tem a ponta: " + ponta);
        System.out.println("Esta caneta tem carga: " + carga + "%");
        System.out.println("Esta caneta esta tampada: " + tampada);
    }
}
