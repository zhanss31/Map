public class testlist {
    public static void main(String[] args) {
        Object[] arr = new Object[3];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        list ls = new list(arr);
        list b = new list();
        for (int i = 0; i < 3; i++) {
            System.out.println(ls.get(i));
        }

        System.out.println(ls.IsEmpty());
        System.out.println(b.IsEmpty());


        ls.add(8);
        System.out.println(ls.get(3));
        System.out.println();


        ls.add(6, 2);
        for (int i = 0; i < 5; i++) {
            System.out.println(ls.get(i));
        }

        System.out.println();
        System.out.println(ls.remove(2));
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(ls.get(i));
        }

        System.out.println();
        System.out.println(ls.set(7, 2));
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(ls.get(i));
        }
        System.out.println();

        System.out.println();
        System.out.println(ls.contains(7));
        System.out.println();

        System.out.println();
        System.out.println(ls.contains(5));
        System.out.println();

        System.out.println();
        System.out.println(ls.indexОf(7));
        System.out.println();

        System.out.println();
        System.out.println(ls.size());
        System.out.println();
    }
}
