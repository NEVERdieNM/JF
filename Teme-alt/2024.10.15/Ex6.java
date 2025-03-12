public class Ex6 {
    
    enum Operation {
        ADDITION {
            public void apply(int a, int b) {
                System.out.println(a + b);
            }
        },
        SUBTRACTION {
            public void apply(int a, int b) {
                System.out.println(a - b);
            }
        }, 
        MULTIPLICATION {
            public void apply(int a, int b) {
                System.out.println(a * b);
            }
        }, 
        DIVISION {
            public void apply(int a, int b) {
                System.out.println(a / b);
            }
        };

        public abstract void apply(int a, int b);
    }
}
