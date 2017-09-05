import java.util.Stack;

/**
 * Created by jiayicheng on 17/7/27.
 */
public class Queue_Via_Stack {
    public class MyQueue<T> {
        Stack<T> head, tail;//用什么？？？

        public MyQueue()//构造函数？？？？
        {
            head = new Stack<T>();
            tail = new Stack<T>();//不一样的参数，所以不需要，构造函数顾名思义，构造出这一个对象就可以
        }
        public void add(T data)
        {
            tail.push(data);
        }

        public T remove(){
            T data;
            data=head.pop();
            shiftstack();//一般不要弄，会捣乱顺序。
            return data;
        }

        public void shiftstack()
        {
            if(head.isEmpty())
                if(!tail.isEmpty())
                    head.push(tail.pop());//实在不行了弄一个
        }

        public T peek()
        {
            return head.peek();
        }
        public boolean isEmpty()
        {
            if(head==null&&tail==null)
                return true;
            else
                return false;
        }
    }


}
