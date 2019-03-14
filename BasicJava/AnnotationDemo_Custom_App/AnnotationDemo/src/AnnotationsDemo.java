@interface MyAnnotation
{
	System.out.println("Sorry, for make changes in your Good example");
} 

public class AnnotationsDemo
{
	@MyAnnotation
	public static void main(String args[])
	{
		System.out.println("Hi");
	}
}
