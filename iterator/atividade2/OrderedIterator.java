package estruturas;

public class OrderedIterator implements Iterator {

    private ListaEncadeada.Node node;


    public OrderedIterator(ListaEncadeada.Node node) {
        this.node = node;

    }

    public boolean hasNext() {
        return node != null;

    }

    @Override
    public Object getNext() {
        Object item = node.dado;
        node = node.proximo;
        return item;
    }
}
