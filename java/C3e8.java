import java.util.Scanner;

public class C3e8 {
    public static void main(String[] args) {
        Showresult();
        
        
    }
    static void Showresult(){
        double _double = Getnumber();
        int _reduc = 10;

        System.out.println(_double + "Euro\n" + Conversion(_double, 1.19) + "Dolar" + "\n" + Conversion(_double, 3395) + "Tugrik" +  "\n" + Taxe(_double, 21) + "Euro" + "\n" + Taxe(_double, 7.5) + "Dolar" + "\n" + Taxe(_double, 10) + "Tugrik" + "\n" + Reduction(Taxe(_double, 21), _reduc) + "Euro" + "\n" + Reduction(Taxe(_double, 7.5), _reduc) + "Dolar" + "\n" + Reduction(Taxe(_double, 10), _reduc) + "Tugrik");

        
     
    }
    static double Getnumber(){
Scanner scan = new Scanner(System.in);
System.out.println("write a price ()");
double scannedDouble = scan.nextDouble();
scan.close();
return scannedDouble;

    }
    static double Conversion(double _double, double _mult){
return _double*_mult;


    }
static double Taxe(double _double, double _percent){
return _double + _double * _percent / 100;

}
static double Reduction(double _double, double _reduc){
    return _double - _reduc;
}


}
