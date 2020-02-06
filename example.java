public class example 
{
public static void main(String[] args)
{
student s=new student();
s.setName("ANKUR");
s.setAge(20);
s.setRoll(29);
s.setDetail("16/09/98");
s.setDetail(160,20);
System.out.println("Name:"+s.getName());
System.out.println("Age:"+s.getAge());
System.out.println("Roll:"+s.getRoll());
System.out.println("DOB:"+s.getDetail());
s.GetDetail();
}
}
