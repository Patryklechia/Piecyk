package Piecyk;
interface piec{
    void PiecPiekacz();

}
public class Piec implements piec{
private int czas;
private int temperatura;

@Override
public void PiecPiekacz(){
    czas=100;
    temperatura=80;
    wlacz();
}
public void wlacz(){
System.out.println("Wlaczamy Piec i " + "ustawiamy temperature na: " + temperatura +" stopni, i czas na: " + czas + " minut");
}
}