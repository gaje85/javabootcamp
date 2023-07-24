package com.toyato.training;

public class ModifierExample {
	
	protected int count = 100;

	public static void main(String[] args) {
		ModifierExample me = new ModifierExample();
		int co = me.count;
	}
}

class Sub extends ModifierExample{
	
	public sub() {
		count++;
	}
}

class NoSub {
	
	
	public NoSub() {
		ModifierExample me = new ModifierExample();
		me.count++;
	}
}


