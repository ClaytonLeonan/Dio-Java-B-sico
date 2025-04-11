public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);
        System.out.println( "o canal é:" + smartTv.canal);

        smartTv.ligar();
            System.out.println("status da televisão ligada: " + smartTv.ligado);
    
        smartTv.desligar();
            System.out.println("status da televisão desligado: " + smartTv.ligado );
    
    }
}
