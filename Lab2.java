class Lab2 {

    static void printTree(int levels) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    static void createArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = value;
                value += 3;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        System.out.println("=== Ялинка ===");
        printTree(5); 

        System.out.println("\n=== Двовимірний масив ===");
        createArray(3, 4);
    }
}
