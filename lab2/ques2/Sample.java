class Sample

{

public static void main(String args[])

{

int total=0;
int a = Integer.parseInt(args[0]);
String b = args[1];
int c = Integer.parseInt(args[2]);

if(b.equals("+"))
{
total = a+c;
System.out.println(total+" is the sum");
}else if(b.equals("-"))
{
total = a-c ;
System.out.println(total+" is difference");
}else if(b.equals("*"))
{
total = a/c ;
System.out.println(total+" is divident");
}

else
{
total = a*c ;
System.out.println(total+" is product");

}

}



}