package cc.wubo.stack;

public class Stack<E> {

	private Object[]data = null;
	private int maxSize=0; //栈容量
	private int top=-1;	//栈顶指针
	/**
	 * 构造函数：根据给定的size初始化栈
	 */
	public Stack() {
		this(10);
	}
	public Stack(int initialSize) {
		if(initialSize>=0) {
			this.maxSize = initialSize;
			data = new Object[initialSize];
			top = -1;
		}else {
			throw new RuntimeException("初始化大小不能小于0:"+initialSize);
		}
	}
	// 判空
	public boolean empty() {
		return top==-1?true:false;
		
	}
	//进栈，第一个元素top=0
	public boolean push(E e) {
		if(top==maxSize-1)
			throw new RuntimeException("栈已满，无法将元素入栈");
		else {
			data[++top]=e;
			return true;
		}
	}
	
	//查看栈顶元素但不移除
	public E peek() {
		if(top==-1)
			throw new RuntimeException("栈为空！");
		else
			return (E)data[top];
	}
	
	//弹出栈顶元素
	public E pop() {
		if(top==-1)
			throw new RuntimeException("栈为空！");
		else
			return (E)data[top--];
		
	}
	
	//返回对象在堆栈中的位置，以1为基数
	public int search(E e) {
		int i  = top;
		while(top!=-1) {
			if(peek()!=e)
				top--;
			else 
				break;
			
			}
		int result = top+1;
		top = i;
		return result;
		}
		
	
}
