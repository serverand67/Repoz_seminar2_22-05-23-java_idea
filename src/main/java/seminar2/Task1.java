package seminar2;

//import lombok.extern.log4j.Log4j;
//import lombok.extern.slf4j.Slf4j;
//import lombok.extern.slf4j.XSlf4j;
//
////Дано четное число N (>0) и символы c1 и c2.
////Написать метод, который вернет строку длины N,
////которая состоит из чередующихся символов c1 и c2, начиная с c1.
//    @Log4j
    public class Task1 {
        private String one = "c1";
        private String two = "c2";

        public void build(int num) {
            StringBuilder build = new StringBuilder("c1");
            for (int i = 1; i < num; i++) {
                if (i % 2 == 0) {
                    build.append("c1");
                } else {
                    build.append("c2");
                }
            }
            System.out.println(build);
        }

    }

