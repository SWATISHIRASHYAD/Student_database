class Main{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
project3 stud = new project3();
System.out.println("do you want to insert another student detail??(0/1)");
int A=sc.nextInt();
if(A==1){
String usn=stud.create();
stud.write(usn);
}
else{
System.out.println("enter USN");
String ch = sc.next();
try {
try (java.io.FileReader a = new FileReader(ch+".txt");
BufferedReader br=new BufferedReader(a) ) {
String i;a
while ((i = br.readLine()) != null) {
System.out.println(i+"\n");
}
} finally {
System.out.println("file closed");
}
} catch (IOException e) {
System.out.println("exception handled..."+e);
}
}
}
}
}
