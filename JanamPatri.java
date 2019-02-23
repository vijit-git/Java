class Janam
{
String name;
int dob;
String place;

public void disp()
{
System.out.println("Apka Janam ki Suchna  :  " + "NAAM  :" +name+"  "+"Tithi : "+dob+"  "+  "STHAN  : " +place);
}

public  Janam(String name,int dob,String place)
{
this.name=name;
this.dob=dob;
this.place=place;
}
}
public class JanamPatri
{
public static void main(String  [] args  )
{
Janam j =new Janam("Vijit",2481988,"Katangi");
j.disp();

}



}