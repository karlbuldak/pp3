class Converter{
public static double CelciusToKelvin(double celcius){
    return celcius+273.15;
}
public static double CelciusToFarenheit(double celcius){
    return celcius*1.8+32;    
}
public static double KelvinToCelcius(double kelvin){
    return kelvin-273.15;
}
public static double KelvinToFarenheit(double kelvin){
    return 1.8*(kelvin-273.5)+32;   
}
public static double FarenheitToCelcius(double farenheit){
    return (farenheit-32)*0.5556;
}
public static double FarenheitToKelvin(double farenheit){
    return (farenheit+459.67)*0.5556;   
}

public static void main(String[] args){
    System.out.println(CelciusToKelvin(25));
    System.out.println(CelciusToFarenheit(25));
    System.out.println(FarenheitToKelvin(100));
    System.out.println(FarenheitToCelcius(100));
    System.out.println(KelvinToCelcius(0));
    System.out.println(KelvinToFarenheit(0));
}
}

