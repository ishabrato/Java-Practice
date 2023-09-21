class VarArgs {
   static int sum(int ...arr){
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum using VarArgs");
        System.out.println(sum(1,2,3,4));
    }
}
