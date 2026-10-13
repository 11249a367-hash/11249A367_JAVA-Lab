AIM:
To write text into a file using FileWriter.

ALGORITHM:
1. Create a FileWriter object for the output file.
2. Write text into the file using write().
3. Close the FileWriter.
4. Display a confirmation message.

CODE:
import
java.io.*;
class
Filewriter
{
public static void main(String[]args)
{
try
{
FileWriter fw= new
FileWriter("sample2.txt"); for(char
i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}

}
}

OUTPUT:
ABCDEFGHIJKLMNOPQRSTUVWXYZ

RESULT:
Data is successfully written to the file using FileWriter.
