package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {

        // 0, 1, 2, 3 trimestres
        // 0, 1, 2 meses
        int[][] dias = new int[4][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 30;

        dias[3][0] = 31;
        dias[3][1] = 30;
        dias[3][2] = 31;

//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//        }

        System.out.println("-----------------------");

        for(int[] arrayBase: dias){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
