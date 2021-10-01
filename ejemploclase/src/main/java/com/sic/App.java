package com.sic;
public class App 
{
    public static void main( String[] args )
    {
        Auto[] automotriz = new Auto[4];
        automotriz[0] = new Auto ("Golf",2021);
        automotriz[1] = new Auto ("Tsuru",2010);
        automotriz[2] = new Auto ("Fiesta",2015);
        automotriz[3] = new Auto ("Vento",2007);
        System.out.println(automotriz[0].getModelo());
        automotriz[3].setAnio(2005);
    }
}