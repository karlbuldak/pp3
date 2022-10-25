class SurfaceArea{
    public static double poleKola(double promien){
        return(3.14*promien*promien);
    }
    public static double poleProstokata(double bokProstokataA, double bokProstokataB){
        return(bokProstokataA*bokProstokataB);
    }
    public static double poleTrojkata(double podstawaTrojkata, double wysokoscTrojkata){
        return(0.5*podstawaTrojkata*wysokoscTrojkata);
    }
    
    public static void main(String[] args){
        System.out.println(poleKola(10));
        System.out.println(poleTrojkata(5,10));
        System.out.println(poleProstokata(30,40));
    }
}