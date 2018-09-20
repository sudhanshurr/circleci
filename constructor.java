class test
{
static int a=20;
static int b=30;



test( int a ,int b)
{
this.a=a;
this.b=b;
System.out.println("the value of a " +a  +"the value of b"  +b);

}


test(float a,int b)
{
System.out.println(a+b);
}

public static void main(String []args)
{
test ob=new test(2.5f,4);
}
}

