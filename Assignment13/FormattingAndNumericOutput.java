import java.util.Locale;
import java.text.*;

class FormattingAndNumericOutput{
    public static void main(String[] args ) {
        String Thing;
        double value = 713607789.11665 ;
        double VAL = -986468977.869326;
        int VLAUe, Value;
        VLAUe = 545442; 
        Value = 268692879;
        Locale.setDefault( Locale.GERMANY );
        DecimalFormat decform = new DecimalFormat("000000000,00");// some random decimals formats
        DecimalFormat decformT = new DecimalFormat("0,00,000"); 
        DecimalFormat decformTHR = new DecimalFormat("0000,00,0,00");
        DecimalFormat decformF = new DecimalFormat("0,00000,0");
        System.out.println( "value = " + decform.format(value) ); // outputs diffrent values in difrent formats
        System.out.println( "value = " + decformT.format(VLAUe) );
        System.out.println( "value = " + decformTHR.format(VAL) );
        System.out.println( "value = " + decformF.format(Value) );
    }
}