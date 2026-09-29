import
java.io.*;
class
Filereader
{
public static void main(String[]args)
{

try
{
FileReader fr=new
FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
