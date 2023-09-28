package Job4j.GobertStild;

class Stack {
    int[] stack = new int[10];
    int tos;
    // Инициализация верхушки стека
    Stack() {
        tos = -1;
    }
    // Заталкивание элемента в стек
    void push(int item) {
        if (tos==9)
            System.out.println("Стек полон.");
        else
            stack[++tos] = item;
    }
    // Выталкивание элемента из стека
    int pop () {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stack[tos--];
    }
}


