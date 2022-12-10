package Atividade01;

public class colorConsole {

    String CSI = "\u001B[";
    
    public void blue()      {System.out.println(CSI + "34" + "m");}
    public void cyan()      {System.out.println(CSI + "36" + "m");}
    public void grenn()     {System.out.println(CSI + "32" + "m");}
    public void red()       {System.out.println(CSI + "31" + "m");}
    public void violet()    {System.out.println(CSI + "35" + "m");}
    public void yellow()    {System.out.println(CSI + "33" + "m");}
    public void white()     {System.out.println(CSI + "m");}
}