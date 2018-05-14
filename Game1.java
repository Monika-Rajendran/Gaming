import java.io.*;
importjava.util.*;
class Game1
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int a[]=new int[3];
int b[]=new int[3];
int c[]=new int[3];
int t[]=new int[10];
int g[]=new int[9];
int i,j,k,l,m,n,h,x,c1=0,c2=0,c3=0;
System.out.println("Game Rules::\n");
System.out.println("1.Only 3 players are allowed");
System.out.println("2.Each player is allocated with 3 cards as their 1st turn");
System.out.println("3.By starting the game each one should give one card to the next person");
System.out.println("4.This will continue until the announcement of winner");
System.out.println("5.Suggestions will also be available. At that time other players should not see those suggestions\n");
System.out.println("One...\n");
System.out.println("Two...\n");
System.out.println("Three...\n");
System.out.println("Here you go\n");
System.out.println("Other than players anyone can give 1,2,3 in any order for 3 times");
for(h=0;h<g.length;h++)
{
g[h]=ob.nextInt();
if(g[h]<=0||g[h]>3)
{
System.out.println("Invalid..Give only 1,2,3");
h--;
}
else
{
if(g[h]==1)
{
c1=c1+1;
if(c1>3)
{
System.out.println("One Not more than 3 times");
h--;
}
}
else if(g[h]==2)
{
c2=c2+1;
if(c2>3)
{
System.out.println("Two Not more than 3 times");
h--;
}
}
else if(g[h]==3)
{
c3=c3+1;
if(c3>3)
{
System.out.println("Three Not more than 3 times");
h--;
}
}
}
}
a[0]=g[2];
a[1]=g[8];
a[2]=g[5];
b[0]=g[1];
b[1]=g[3];
b[2]=g[0];
c[0]=g[4];
c[1]=g[7];
c[2]=g[6];
i=0;
j=1;
k=2;
while(!(a[i]==a[j]&&a[j]==a[k])||(b[i]==b[j]&&b[j]==b[k])||(c[i]==c[j]&&c[j]==c[k]))
{
System.out.println();
for(x=0;x<3;x++)
{
System.out.println(a[x]);
}
if(a[0]==a[1]&&a[1]==a[2])
break;
System.out.println("Player1: Type which card you are giving");
t[0]=ob.nextInt();
System.out.println();
while(t[0]<=0||t[0]>3)
{
System.out.println("Invalid.Please type another time");
t[0]=ob.nextInt();
System.out.println();
}
while(t[0]!=a[0]&&t[0]!=a[1]&&t[0]!=a[2])
{
System.out.println("Invalid.This is not your card.Please type another time");
t[0]=ob.nextInt();
System.out.println();
}
if(b[0]==t[0]||b[1]==t[0]||b[2]==t[0])
{
System.out.println("Suggestion for player2:Victory is near by you!");
}
for(x=0;x<3;x++)
{
System.out.println(b[x]);
}
System.out.println();
if(b[0]==b[1]&&b[1]==b[2])
break;
System.out.println("Player2: Type which card you are giving");
t[1]=ob.nextInt();
System.out.println();
while(t[1]<=0||t[1]>3)
{
System.out.println("Invalid.Please type another time");
t[1]=ob.nextInt();
System.out.println();
}
while(t[1]!=b[0]&&t[1]!=b[1]&&t[1]!=b[2])
{
System.out.println("Invalid.This is not your card.Please type another time");
t[1]=ob.nextInt();
System.out.println();
}
for(l=0;l<b.length;l++)
{
if(t[1]==b[l])
{
b[l]=t[0];
break;
}
}
if(c[0]==t[1]||c[1]==t[1]||c[2]==t[1])
{
System.out.println("Suggestion for player3:Victory is near by you!");
}
for(x=0;x<3;x++)
{
System.out.println(c[x]);
}
System.out.println();
if(c[0]==c[1]&&c[1]==c[2])
break;
System.out.println("Player3: Type which card you are giving");
t[2]=ob.nextInt();
System.out.println();
if(t[2]<=0||t[2]>3)
{
System.out.println("Invalid.Please type another time");
t[2]=ob.nextInt();
System.out.println();
}
while(t[2]!=c[0]&&t[2]!=c[1]&&t[2]!=c[2])
{
System.out.println("Invalid.This is not your card.Please type another time");
t[2]=ob.nextInt();
System.out.println();
}
for(n=0;n<c.length;n++)
{
if(t[2]==c[n])
{
c[n]=t[1];
break;
}
if(a[0]==t[2]||a[1]==t[2]||a[2]==t[2])
{
System.out.println("Suggestion for player1:Victory is near by you!");
}

for(x=0;x<a.length;x++)
{
if(t[0]==a[x])
{
a[x]=t[2];
break;

}
}
}
}
i=0;
j=1;
k=2;
if(a[i]==a[j]&&a[j]==a[k])
{
System.out.println("Player1 is the winner");
if(a[0]==1)
System.out.println("Because you have stored 3 Thala MSD");
else if(a[0]==2)
System.out.println("Because you have stored 3 Virat");
else
System.out.println("Because you have stored Raina"); 
}
else if(b[i]==b[j]&&b[j]==b[k])
{
System.out.println("Player2 is the winner");
if(b[0]==1)
System.out.println("Because you have stored 3 Thala MSD");
else if(b[0]==2)
System.out.println("Because you have stored 3 Virat");
else
System.out.println("Because you have stored 3 Raina"); 
}
else if(c[i]==c[j]&&c[j]==c[k])
{
System.out.println("Player3 is the winner");
if(c[0]==1)
System.out.println("Because you have stored 3 Thala MSD");
else if(c[0]==2)
System.out.println("Because you have stored 3 Virat");
else
System.out.println("Because you have stored 3 Raina"); 
}
}
}
