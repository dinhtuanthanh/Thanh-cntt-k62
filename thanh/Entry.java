package thanh;

class Entry {
	public static void main(String[] args) {
		Time t = new Time(10, 2, 4);
		t.display();
		t.setTime(20, 60, 60);
		t.display();
		t.nextSecond();
		t.display();
		t.nextSecond();
		t.display();
		t.setTime(9, 1, 1);
		t.display();
		t.previousSecond();
		t.display();
	}
}

