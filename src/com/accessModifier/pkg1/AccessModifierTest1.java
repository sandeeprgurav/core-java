package com.accessModifier.pkg1;

public class AccessModifierTest1
{
  private static int privateVariable=10;
  protected static  int protectedVariable=10;
  static int defaultVaraible=10;
  public static int publicVaraible=10;
}

class SubClassTest extends AccessModifierTest1
{
	public static void main ( String [ ] args )
	{
		//System.out.println(privateVariable); can't access
		System.out.println(protectedVariable);
		System.out.println(defaultVaraible);
		System.out.println(publicVaraible);
	}
	
	
}