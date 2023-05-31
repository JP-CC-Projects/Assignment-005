package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		int i = 0;
		while (i < items.length -1){
			if(items[i] == null){
				items[i] = item;
				return true;
			}

			else if(items[items.length - 2] != null){
				makeArrayBigger();
			}
			i++;
		}
		return false;
	}

	public void makeArrayBigger(){
		Object[] items = new Object[this.items.length *2];
		for (int i = 0; i < this.items.length - 1; i++) {
			items[i] = this.items[i];
		// Code suggestion by IntelliJ:
		//		if (this.customArraySize - 1 >= 0) {
		//		System.arraycopy(this.items, 0, items, 0, this.customArraySize - 1);
		//		}

		}
		this.items = items;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		return (T)items[index];
	}
}
