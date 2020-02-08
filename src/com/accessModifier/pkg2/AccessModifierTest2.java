
package com.accessModifier.pkg2 ;

import com.accessModifier.pkg1.AccessModifierTest1;

public class AccessModifierTest2
{
	public static void main ( String [ ] args )
	{
		//System.out.println(privateVariable); //cant access
		//System.out.println(AccessModifierTest.protectedVariable);//cant access
		//System.out.println(AccessModifierTest.defaultVaraible);//cant access
		System.out.println(AccessModifierTest1.publicVaraible);
		
	}
}

class SubClassTest extends AccessModifierTest1{
	public static void main ( String [ ] args )
	{
		//System.out.println(privateVariable); //cant access
		System.out.println(AccessModifierTest1.protectedVariable);
		//System.out.println(AccessModifierTest1.defaultVaraible);//cant access
		System.out.println(AccessModifierTest1.publicVaraible);
	}
}