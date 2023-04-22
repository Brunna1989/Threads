public class Main {

    public static void main(String[] args){
        ThreadImpar threadImpar = new ThreadImpar();
        ThreadPar threadPar= new ThreadPar();
        threadPar.start();
        threadImpar.start();
    }
}