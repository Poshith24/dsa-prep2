package com.posh.staticExample;

//Only inner classes can be static..

//class Test{
//    static String name;
//    public Test(String name){
//        Test.name = name;
//    }
//}

public   class InnerClasses {

//    static class Test{
//        String name;
//        public Test(String name){
//             this.name = name;
//        }
//    }

      static class Test{
         String name;
        public Test(String name){
            this.name = name;
        }

          @Override
          public String toString() {

            return name;
          }
      }

    public static void main(String[] args) {
        Test a = new Test("Poshith");
        Test b = new Test("Poojith");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }

}
