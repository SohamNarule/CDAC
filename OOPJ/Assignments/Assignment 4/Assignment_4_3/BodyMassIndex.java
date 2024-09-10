package org.bodymass;

public class BodyMassIndex {

	public static void main(String[] args) {
		BodyMassIndexutil b =new BodyMassIndexutil();
		BodyMassIndexFields a =new BodyMassIndexFields();
		b.acceptrecord();
		b.printrecord();
		String str=b.toString();
		System.out.println(str);
	}

}
