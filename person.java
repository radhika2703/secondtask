interface attributes
{
public void setName(String n);
public void setAge(int a);
public String getName();
public int getAge();
}
public class person implements attributes
{
private String name;
private String dob;
private int age;
private int height;
private int weight;
public void setName(String n)
{
name=n; 
}
public void setAge(int a)
{
age=a;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
public void setDetail(String d)
{
dob=d;
}
public void setDetail(int ht,int wt)
{
height=ht;
weight=wt;
}
public String getDetail()
{
return dob;
}
public void GetDetail()
{
System.out.println("Height:"+height+"\t"+"Weight:"+weight);
}
}
