package SemisterExam;


class Test {
    protected void finalize() {
        System.out.println("Object is destroyed from the test");
    }
}

class Finalizes {
    public static void main(String[] args) {
        Test t = new Test();
        t = null; // object becomes eligible for GC
        System.gc(); // request garbage collection
    }
}
