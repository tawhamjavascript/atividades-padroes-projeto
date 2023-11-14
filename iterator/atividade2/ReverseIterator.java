package estruturas;

import java.util.Stack;

public class ReverseIterator implements Iterator {

    private Stack<ListaEncadeada.Node> stack;

    public ReverseIterator(ListaEncadeada.Node node) {
        build_stack(node);
    }

    private void build_stack(ListaEncadeada.Node node) {
        while (node != null) {
            stack.push(node);
            node = node.proximo;
        }
    }

    public boolean hasNext() {
        return stack.isEmpty();
    }

    public Object getNext() {
        return stack.pop();
    }
}
