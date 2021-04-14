package sec06.ch07;

public interface MyList {
	void add (int value);
	void add (int index, int value); 
	
	int size();
	int get(int index);
	
	//제일 끝방을 지우고, 반환한다.
	int remove();
	//index번째 데이터를 지우고, 반환한다.
	int remove(int index); 
}
