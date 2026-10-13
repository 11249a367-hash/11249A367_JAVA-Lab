AIM:
To read and display the contents of a text file using FileReader.

ALGORITHM:
1. Create a text file named input.txt with some content.
2. Create a FileReader object for the file.
3. Read characters until the end of the file is reached.
4. Display the characters read from the file.
5. Close the FileReader.

CODE:
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

OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S

T
U
V
W
X
Y
Z

RESULT:
The contents of the text file are successfully read using FileReader.
