/**
 * Pass by Value vs Pass by Reference
✅ 1. Pass by Value

👉 A copy of the actual value is passed to the function.

Changes inside function ❌ do NOT affect original variable
Works with primitive data types (int, float, etc.)
Example:
void change(int x) {
    x = 50;
}

public static void main(String[] args) {
    int a = 10;
    change(a);
    System.out.println(a); // 10
}

👉 a remains 10 (no change)

✅ 2. Pass by Reference (conceptually)

👉 The reference (address of object) is used to access the original data.

Changes inside function ✅ affect original object
Used with objects
Example:
class Test {
    int value;
}

void change(Test obj) {
    obj.value = 50;
}

public static void main(String[] args) {
    Test t = new Test();
    t.value = 10;

    change(t);
    System.out.println(t.value); // 50
}

👉 Object value changes
 */