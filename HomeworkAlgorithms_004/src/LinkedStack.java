public class LinkedStack {
    private Node tail; // ссылка на последний добавленный узел (обёртку)
    private int size; // размер стека, т.е. количество элементов в нём

    public void push(int value) {
        Node node = new Node(value); // создаём новый узел
        if (tail != null) { // если в стеке уже есть элементы
            node.setPrev(tail); // связываем новый узел с последним
        }
        tail = node; // назначаем новый узел последним узлом
        size++; // увеличиваем счётчик элементов
    }

    public int pop(){
        // ваш код
        // возьмите value из последнего узла
        // назначьте предыдущий к последнему узлу последним узлом
        int value = tail.getValue();
        tail = tail.getPrev();
        size--;
        return value;
    }

    public int getSize() {
        // ваш код
        // верните размер стека
        return size;
    }

    public boolean isEmpty() {
        // ваш код
        // верните ответ на вопрос, не пустой ли стек
        return size == 0;
    }

    public String toString() {
        // Если есть элементы, пройдитесь по связному списку,
        // выводя элементы.
        // Вывод должен быть в точности как в комментариях к main
        // при этом этот метод не должен менять стек!
        if (isEmpty()) {
            return "EMPTY";
        }
        StringBuilder stackOutput = new StringBuilder(Integer.toString(tail.getValue()));
        Node tempTail = tail;
        for (int i = 0; i < size - 1; i++) {
            stackOutput.append(" -> ").append(Integer.toString(tempTail.getPrev().getValue()));
            tempTail = tempTail.getPrev();
        }
        return stackOutput.toString();
    }
}
