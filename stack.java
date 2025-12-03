public class stack {

    private String[] array;
    private int top;

    public stack() {
        array = new String[128];
        top = 0;
    }

    public void push(String x) {
        if (top >= array.length)
            return;
        array[top] = x;
        top++;
    }

    public String pop() {
        if (top == 0)
            return null;
        top--;
        return array[top];
    }

    public String peek() {
        if (top == 0)
            return null;
        return array[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void clear() {
        top = 0;
    }


    public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("====== STACK CONTENT ======  \n");

	    if (top == 0) {
	        sb.append("EMPTY");
	    } else {
	        for (int i = 0; i < top; i++) {
	            sb.append(array[i]);
	            if (i != top - 1) {
	                sb.append(" | ");
	            }
	        }
	    }

	    sb.append("\n=========");
	    return sb.toString();
}
}