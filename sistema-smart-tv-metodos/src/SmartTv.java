public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("o canal agora está no: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("o canal agora está no: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void ligar (){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
}