package com.toyota.inter;

import com.toyato.training.ModifierExample;

public class SubModifierExample extends ModifierExample{
	
	
	public SubModifierExample() {
		count++;
	}

}

class Test{
	public Test() {
		ModifierExample me = new ModifierExample();
		me.count++;
	}
}
