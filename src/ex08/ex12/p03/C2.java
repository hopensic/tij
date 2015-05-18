package ex08.ex12.p03;

import ex08.ex12.p01.I1;
import ex08.ex12.p02.C1;

public class C2 extends C1 {
	I1 getInterface(){
		i = 3;
		C2 c2 = new C2();
		return new InnerClass1(); 
	}
}
