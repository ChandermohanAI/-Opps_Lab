class Object

{


public static void main(String args[])

{



Class obj=new Class();

obj.setA(10);

System.out.println(obj.getA());





if(args.length!=0)

{


for(int i=0;i<args.length;i++)

{

System.out.println("Argument "+i+"is:"+args[i]);

}

}

else

{

System.out.println("No CLA");

}


}

}