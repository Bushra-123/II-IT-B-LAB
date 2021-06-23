class Leapyear
{
public static void main(String[] args)
{
int year=1996;
if(year % 4 == 0 && year % 400 == 0)
{
System.out.println("Leapyear");
}
else
{
System.out.println("Not a Leapyear");
}
}
}