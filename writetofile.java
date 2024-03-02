x
public void write(String usn) { 
try { 
FileWriter f = new FileWriter(usn+".txt"); 
BufferedWriter bw=new BufferedWriter(f); 
try { 
System.out.println("enter name:"); 
String name=sc.next(); 
System.out.println("enter usn:"); 
String USN=sc.next(); 
String phno=null; 
int k; 
k=0; 
while(k!=1){ 
System.out.println("enter valid phone no:"); 
phno=sc.next(); 
if(isvalidnumber(phno) && phno.length()==10 ){ 
k=1; 
} 
} 
System.out.println("enter dob:"); 
String dob=sc.next(); 
System.out.println("enter course:"); 
String course=sc.next(); 
System.out.println("enter email:"); 
String email=sc.next(); 
System.out.println("enter bloodgroup:"); 
String blood=sc.next(); 
System.out.println("enter aadhar number:"); 
String aadhar=sc.next(); 
System.out.println("enter city:"); 
String city=sc.next(); 
System.out.println("enter state:"); 
String state=sc.next(); 
System.out.println("enter present address:"); 
String address=sc.next(); 
System.out.println("Enter parent details:"); 
System.out.println("enter father name:"); 
String fathname=sc.next(); 
String fathphno=null; 
k=0; 
while(k!=1){ 
System.out.println("enter father's valid phone no:"); 
fathphno=sc.next(); 
if(isvalidnumber(fathphno) && fathphno.length()==10){ 
k=1; 
} 
} 
System.out.println("enter father occupation:"); 
String fathocc=sc.next(); 
System.out.println("enter mother's name:"); 
String mothname=sc.next(); 
k=0; 
String mothphno=null; 
while(k!=1){ 
System.out.println("enter mother's valid phone no:"); 
mothphno=sc.next(); 
if(isvalidnumber(mothphno) && mothphno.length()==10){ 
k=1; 
} 
} 
System.out.println("enter mother's occupation:"); 
String mothocc=sc.next(); 
System.out.println("enter bank datails"); 
System.out.println("enter  bank name:"); 
String bankname=sc.next(); 
System.out.println("enter account number:"); 
String accno=sc.next(); 
System.out.println("enter ifsc code:"); 
String ifsc=sc.next(); 
System.out.println("enter academic detalis"); 
System.out.println("enter physics marks"); 
int p = sc.nextInt(); 
System.out.println("enter chemistry marks"); 
int c = sc.nextInt(); 
System.out.println("enter maths marks"); 
int m = sc.nextInt(); 
System.out.println("enter computer science marks"); 
int cs = sc.nextInt(); 
System.out.println("enter 2nd language marks"); 
int h = sc.nextInt(); 
System.out.println("enter english marks"); 
int e = sc.nextInt(); 
long total = p+c+m+cs+h+e; 
System.out.println("the total marks"+total); 
long result =(total/6); 
System.out.println("the percentage"+result); 
String ans=null; 
System.out.println("Enter curricular activities details"); 
ans=sc.next(); 
bw.write( 
"**STUDENT PERSONAL DETAILS**"+"\n"+ 
"Name:"+name+"\n"+ 
"USN:"+USN+"\n"+ 
"Mobile number:"+phno+"\n"+ 
"DOB:"+dob+"\n"+ 
"Course:"+course+"\n"+ 
"Email:"+email+"\n"+ 
"Blood Group:"+blood+"\n"+ 
"Aadhar number:"+aadhar+"\n"+ 
"City:"+city+"\n"+ 
"State:"+state+"\n"+ 
"Residential address:"+address+"\n"+ 
"~~~~~PARENT DETAILS~~~~~"+ 
"Father's name:"+fathname+"\n"+ 
"Father's ph-number"+fathphno+"\n"+ 
"Father's Occupation:"+fathocc+"\n"+ 
"Mother's name:"+mothname+"\n"+ 
"Mother's phone number"+mothphno+"\n"+ 
"Mother's occupation"+mothocc+"\n"+ 
"$$$$$~BANK DETAILS~S$$$$"+"\n"+ 
"Bank name:"+bankname+"\n"+ 
"Account no:"+accno+"\n"+ 
"IFSC code:"+ifsc+"\n"+"% % % ACADEMIC DETAILS % % %"+"\n"+ 
"physics marks:"+p+"\n"+ 
"chemistry marks:"+c+"\n"+ 
"maths marks:"+m+"\n"+ 
"computer science marks:"+cs+"\n"+ 
"2nd language marks:"+h+"\n"+ 
"English marks:"+e+"\n"+ 
"total marks:"+total+"\n"+ 
"percentage:"+result+"\n"+ 
"~~Extra Curricular activities details~~~"+ 
"\n"+ans); 
bw.close(); 
} finally { 
bw.close(); 
} 
} 
catch(IOException e) { 
System.out.println(" handled"+e); 
} 
}
