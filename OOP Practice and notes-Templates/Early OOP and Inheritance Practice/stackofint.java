public class stackofint {

    private int[] elements;
    private int size;

    public static final int def_cap = 16;

    public stackofint() {
        this(def_cap);

    }

    public stackofint(int cap){
        elements = new int[cap];

    }

    public boolean empty(){

        return size == 0;


    }

    public int getSize(){
        return size;
    }


    public int push(int value){

        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);

            elements = temp;
        }

        return elements[size++] = value;

    }


    public static void main(String[] args){

        stackofint stack = new stackofint();

        for (int i=0; i<10; i++){
            stack.push(i);
        }

        while(!stack.empty()){

            System.out.print(stack.pop() + " ");
        }

    }


    public int pop(){

       return elements[--size];

    }

    public int peek(){

      return elements[size - 1];

    }

}
